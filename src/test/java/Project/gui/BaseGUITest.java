package Project.gui;

import org.junit.Test;
import org.junit.Assert;


public class BaseGUITest {

    BaseGUI b = new BaseGUI();


    @Test
    public void testChangePlayerNames(){


        b.playerNames[1] = "Max";
        b.playerNames[3] = "Tim";
        String[] expectedResult = new String[]{"Max", "Tim", "", "", "", ""};
        b.changePlayerNames(b.playerNames);
        Assert.assertArrayEquals(expectedResult, b.playerNames);

    }

    @Test
    public void testAddPlayerName(){

        b.playerNames[0] = "Max";
        b.playerNames[1] = "Tim";
        b.playerNames[2] = "Lisa";

        b.addPlayername();

        for (int i = 0; i < b.playerNames.length; i++){
            Assert.assertEquals(b.playerNames[i], b.name.getText());
            b.addPlayername();
            if (i == b.numberOfPlayers(b.playerNames)-1) return;
        }

    }

    @Test
    public void testNumberOfPlayers(){

        b.playerNames[0] = "Max";
        b.playerNames[1] = "Tim";
        b.playerNames[2] = "Lisa";

        Assert.assertTrue(3 == b.numberOfPlayers(b.playerNames));
        Assert.assertFalse(6 == b.numberOfPlayers(b.playerNames));
    }
}
