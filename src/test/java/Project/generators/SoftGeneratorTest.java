package Project.generators;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SoftGeneratorTest {

    private SoftGenerator testSoft = new SoftGenerator();


    //Testen fillSoftCardsToArray-Methode

    @Test
    public void fillSoftCardsToArrayIsEmpty() {
        assertFalse(testSoft.fillSoftCardsToArray().isEmpty());
    }

    @Test
    public void fillSoftCardToArrayPositive() {

        assertTrue(testSoft.fillSoftCardsToArray().contains("Was ist dein größter Traum?"));
        assertTrue(testSoft.fillSoftCardsToArray().contains("Was ist das Peinlichste, was dir je passiert ist?"));
        assertTrue(testSoft.fillSoftCardsToArray().contains("Brauchst du ein Kuscheltier zum Einschlafen?"));
        assertTrue(testSoft.fillSoftCardsToArray().contains("Mache 5 Liegestütze!"));
        assertTrue(testSoft.fillSoftCardsToArray().contains("Singe einen Teil eines Liedes!"));
        assertTrue(testSoft.fillSoftCardsToArray().contains("Berühre mit deinen Fingerspitzen deine Zehenspitzen und streck dabei die Knie durch!"));
    }

    @Test
    public void fillSoftCardToArrayNegative() {
        assertFalse(testSoft.fillSoftCardsToArray().contains("Der hier steht nicht drin"));
        assertFalse(testSoft.fillSoftCardsToArray().contains("Der hier auch nicht"));
        assertFalse(testSoft.fillSoftCardsToArray().contains("Ameisenhaufen"));
    }
}