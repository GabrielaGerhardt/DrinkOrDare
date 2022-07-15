package Project.player;

import Project.interfaces.IPlayerField;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PlayerField implements IPlayerField {

    private static final Logger logger = LogManager.getLogger(PlayerField.class);

    private int counter = 2;

    @Override
    public int getCount() {
        return counter;
    }

    @Override
    public void increaseCount() {
        counter++;
    }

    @Override
    public int addPlayerField() {
        counter++;
        logger.info("erzeugt ein neues Feld für einen Spielereintrag {}", counter);
        return counter;
    }
}
