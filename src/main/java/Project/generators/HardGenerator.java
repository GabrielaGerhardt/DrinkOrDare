package Project.generators;

import Project.abstractClasses.CardGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class HardGenerator extends CardGenerator {

    private static final Logger logger = LogManager.getLogger(HardGenerator.class);

    @Override
    public List<String> fillHardCardsToArray() {
        Scanner s = new Scanner(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("ChallengeHard.txt")));
        logger.info("Die Textdatei ChallengeHard wird eingelesen");

        while (s.hasNext()) {
            hardArray.add(s.nextLine());
            logger.info("HardArray wird mit Textdatei befüllt");
        }

        s.close();

        streamer(hardArray);
        logger.info("Stream wurde erstellt");

        Collections.shuffle(neueListe);
        logger.info("Inhalt des HardArrays wird gemischt");
        return neueListe;

    }
}
