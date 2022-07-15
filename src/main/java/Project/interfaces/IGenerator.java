package Project.interfaces;

import Project.exceptions.ArrayNotFilledException;

import java.io.FileNotFoundException;
import java.util.List;

public interface IGenerator {


    /**
     * @return rulesArray of type ArrayList
     * @throws FileNotFoundException, if the txt-file is not found.
     *                                The relevant txt-File gets pulled out of the resources and fills the empty rulesArray with the txt file (1 line per Index).
     *                                After the whole txt file is saved in the array it gets shuffled.
     */

    List<String> fillSoftCardsToArray() throws ArrayNotFilledException;

    /**
     * @return rulesArray of type ArrayList
     * @throws FileNotFoundException, if the txt-file is not found.
     *                                The relevant txt-File gets pulled out of the resources and fills the empty rulesArray with the txt file (1 line per Index).
     *                                After the whole txt file is saved in the array it gets shuffled.
     */

    List<String> fillHardCardsToArray() throws ArrayNotFilledException, FileNotFoundException;


    /**
     * Selects a random category and an associated random card.
     */
    String randomTask() throws FileNotFoundException, ArrayNotFilledException;

    /**
     * This method receives the Array with all cards and turns it into a stream.
     * If the Array contains identical cards, the stream deletes them so we don't have identical cards later in the Application.
     * The streamer()-Method receives a List<String> and returns a new Object of Type List<String>
     *
     * @param currentArray the Array of the category selected by the randomTask()-Method
     */
    void streamer(List<String> currentArray);

}
