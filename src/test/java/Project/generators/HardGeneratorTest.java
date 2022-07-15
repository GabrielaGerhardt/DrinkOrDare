package Project.generators;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HardGeneratorTest {

    private HardGenerator testHard = new HardGenerator();


    //Testen fillHardCardsToArray-Methode

    @Test
    public void fillHardCardsToArrayIsEmpty() {
        assertFalse(testHard.fillHardCardsToArray().isEmpty());
    }

    @Test
    public void fillHardCardToArrayPositive() {

        assertTrue(testHard.fillHardCardsToArray().contains("Massiere für 2 Minuten  deinen rechten Sitznachbarn"));
        assertTrue(testHard.fillHardCardsToArray().contains("Mache einen Handstand"));
        assertTrue(testHard.fillHardCardsToArray().contains("Tausche die Kleidung mit der Person rechts von dir"));
        assertTrue(testHard.fillHardCardsToArray().contains("Für das restliche Spiel hast du nur noch deine Mittelfinger zur Verfügung, alle anderen Finger müssen eingerollt werden"));
        assertTrue(testHard.fillHardCardsToArray().contains("Wähle eine Person die dir einen tritt in den Hintern geben darf"));
        assertTrue(testHard.fillHardCardsToArray().contains("Hast du schonmal eine Straftat begangen?"));
    }

    @Test
    public void fillSoftCardToArrayNegative() {
        assertFalse(testHard.fillHardCardsToArray().contains("Der hier steht nicht drin"));
        assertFalse(testHard.fillHardCardsToArray().contains("Der hier auch nicht"));
        assertFalse(testHard.fillHardCardsToArray().contains("Ameisenhaufen"));
    }
}
