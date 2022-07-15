package Project.player;

import Project.exceptions.ArrayNotFilledException;
import Project.exceptions.IllegalStringException;
import Project.interfaces.IPlayer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PlayerTest {

    private Player testPlayer = new Player();
    private List<String> testArray = new ArrayList<>();


    //Testen der addToArray-Methode

    @Test
    public void addToArrayIsEmpty() throws IllegalStringException {
        assertFalse(testPlayer.addToArray("Lena").isEmpty());
    }

    @Test
    public void addToArrayPositiveTest() throws IllegalStringException {
        assertTrue(testPlayer.addToArray("Nina").contains("Nina"));
        assertTrue(testPlayer.addToArray("Felix").contains("Felix"));
        assertTrue(testPlayer.addToArray("Lukas").contains("Lukas"));
    }

    @Test
    public void addToArrayNegativeTest() throws IllegalStringException {
        assertFalse(testPlayer.addToArray("Ivonne").contains("Yvonne"));
        assertFalse(testPlayer.addToArray("Marius").contains("Markus"));
        assertFalse(testPlayer.addToArray("Tom").contains("Lea"));
    }


    //Testen randomPlayer-Methode

    @Test
    public void randomPlayerPositiveTest() throws ArrayNotFilledException {
        testArray.clear();
        testArray.add("Lena");
        testArray.add("Felix");
        String name1 = testPlayer.randomPlayer(testArray);
        assertTrue(name1.contains("Lena") || name1.contains("Felix"));

        testArray.clear();
        assertTrue(testArray.isEmpty());

        testArray.add("Marius");
        testArray.add("Lea");
        testArray.add("Celine");
        testArray.add("Jonas");
        String name = testPlayer.randomPlayer(testArray);
        assertTrue(name.contains("Marius") || name.contains("Lea") || name.contains("Celine") || name.contains("Jonas"));
    }

    @Test
    public void randomPlayerNegativeTest() throws ArrayNotFilledException {
        testArray.clear();

        testArray.add("Felix");
        testArray.add("Marius");
        testArray.add("Jonas");

        assertFalse(testPlayer.randomPlayer(testArray).contains("Lena"));
        assertFalse(testPlayer.randomPlayer(testArray).contains("Johanna"));
        assertFalse(testPlayer.randomPlayer(testArray).contains("Nala"));
        assertFalse(testPlayer.randomPlayer(testArray).contains("Alina"));
        assertFalse(testPlayer.randomPlayer(testArray).contains("Pia"));

    }


    //Testen von Exceptions

    @Test(expected = ArrayNotFilledException.class)
    public void randomPlayerExceptionTest() throws ArrayNotFilledException {
        IPlayer player = new Player();
        player.randomPlayer(new ArrayList<>());
    }

    @Test(expected = IllegalStringException.class)
    public void addToArrayNullException() throws IllegalStringException {
        testPlayer.addToArray(null);
    }

    @Test(expected = IllegalStringException.class)
    public void addToArrayEmptyException() throws IllegalStringException {
        testPlayer.addToArray("");
    }
}
