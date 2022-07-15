package Project.generators;

import Project.abstractClasses.CardGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SoftGenerator extends CardGenerator {

    private static final Logger logger = LogManager.getLogger(SoftGenerator.class);

    @Override
    public List<String> fillSoftCardsToArray() {
        Scanner s = new Scanner(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("ChallengeSoft.txt")));
        logger.info("Die Textdatei ChallengeSoft wird eingelesen");

        while (s.hasNext()) {
            softArray.add(s.nextLine());
            logger.info("SoftArray wird mit Textdatei befüllt");
        }

        s.close();

        streamer(softArray);
        logger.info("Stream wurde erstellt");

        Collections.shuffle(neueListe);
        logger.info("Inhalt des SoftArray wird gemischt");
        return neueListe;
    }

}
