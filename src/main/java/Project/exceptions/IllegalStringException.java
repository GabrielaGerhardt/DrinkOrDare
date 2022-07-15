package Project.exceptions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IllegalStringException extends Exception{

    private static final Logger logger = LogManager.getLogger(IllegalStringException.class);

    public IllegalStringException() {

        super("Diese Eingabe wird nicht akzeptiert.");

        logger.warn("Eigene Exception wird geschmissen, String ist null oder leer.");
    }
}
