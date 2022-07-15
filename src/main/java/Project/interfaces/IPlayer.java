package Project.interfaces;

import Project.exceptions.ArrayNotFilledException;
import Project.exceptions.IllegalStringException;

import java.io.FileNotFoundException;
import java.util.List;

public interface IPlayer {

    /**
     * @param scannerName the name of the player
     * @return playerNamesArray of type ArrayList
     * @throws FileNotFoundException All players are saved in an ArrayList. This method adds a new player to it.
     *                               The Array-List is used by the randomPlayer-Method to pick a random Player.
     */
    List<String> addToArray(String scannerName) throws IllegalStringException;


    /**
     * clears the playerNamesArray in case that someone returns back to the scene, where you can type in the player names.
     * Because otherwise the names which were typed in first would still remain in the Array.
     */
    void clearArray();


    /**
     * @param playerNamesArray Array of the added player names
     * @return randomName of type String
     * @throws ArrayNotFilledException if the length of the Array is 0
     */
    String randomPlayer(List<String> playerNamesArray) throws ArrayNotFilledException;


    /**
     * @param chosenCard receives a random card from the randomTask()-Method of the Class "CardGenerator"
     * @return cardWithName of type String
     * @throws ArrayNotFilledException If a card has a player name in it, it contains "xxx" as a placeholder.
     *                                 In this method, the "xxx" gets overwritten by a random Name out of the randomPlayer()-Method.
     */

    String uniteCardAndPlayer(String chosenCard) throws ArrayNotFilledException, IllegalStringException;
}
