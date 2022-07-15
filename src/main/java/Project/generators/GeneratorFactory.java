package Project.generators;

import Project.interfaces.IGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GeneratorFactory {

    private static final Logger logger = LogManager.getLogger(GeneratorFactory.class);

    public static IGenerator getCardGenerator(Difficulty difficulty) {

        switch (difficulty) {
            case SOFT:
                logger.info("Soft Objekt wurde erstellt");
                return new SoftGenerator();

            case HARD:
                logger.info("Hard Objekt wurde erstellt");
                return new HardGenerator();
        }

        logger.error("es konnte kein Objekt erstellt werden");
        throw new IllegalStateException("No type for this input");


    }

    public enum Difficulty {
        SOFT,
        HARD;
    }

}
