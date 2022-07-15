package Project.player;

import Project.exceptions.ArrayNotFilledException;
import Project.exceptions.IllegalStringException;
import Project.interfaces.IPlayer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Player implements IPlayer {

    private static final Logger logger = LogManager.getLogger(Player.class);

    /**
     * Defines the name and age of the player.
     */

    private List<String> playerNamesArray = new ArrayList<>();

    @Override
    public List<String> addToArray(String scannerName) throws IllegalStringException {

        if (scannerName == null || scannerName.length() == 0) {
            throw new IllegalStringException();
        }

        playerNamesArray.add(scannerName);


        logger.info("Name wird zum Array hinzugefügt: {}", scannerName);
        return playerNamesArray;
    }


    @Override
    public String randomPlayer(List<String> playerNamesArray) throws ArrayNotFilledException {


        int random;
        String randomName;

        Random rand = new Random();

        int length = playerNamesArray.size();

        if (length == 0) {
            throw new ArrayNotFilledException();
        } else {

            random = rand.nextInt(length);
            randomName = playerNamesArray.get(random);
            logger.info("Zufallsname aus Array wird ausgewählt: {}", randomName);
            return randomName;
        }
    }

    @Override
    public String uniteCardAndPlayer(String chosenCard) throws ArrayNotFilledException, IllegalStringException {
        return null;
    }

    @Override
    public void clearArray() {
        playerNamesArray.clear();
    }
}
