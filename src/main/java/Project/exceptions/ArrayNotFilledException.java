package Project.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayNotFilledException extends Exception{

    private static final Logger logger = LogManager.getLogger(ArrayNotFilledException.class);

    public ArrayNotFilledException() {

        super("Das Array konnte nicht gefüllt werden");

        logger.warn("Eigene Exception wird geschmissen, Array konnte nicht befüllt werden");
    }
}
