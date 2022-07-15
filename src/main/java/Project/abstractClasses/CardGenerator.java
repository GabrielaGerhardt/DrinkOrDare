package Project.abstractClasses;

import Project.exceptions.ArrayNotFilledException;
import Project.interfaces.IGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class CardGenerator implements IGenerator {

    private static final Logger logger = LogManager.getLogger(CardGenerator.class);

    private int indexcounter = 0;

    /**
     * Each Array contains the respective cards of the category.
     */
    protected List<String> softArray = new ArrayList<>();
    protected List<String> hardArray = new ArrayList<>();


    public List<String> fillSoftCardsToArray() throws ArrayNotFilledException{
        return softArray;
    }

    public List<String> fillHardCardsToArray() throws ArrayNotFilledException, FileNotFoundException{
        return hardArray;
    }


    public String randomTask() throws FileNotFoundException, ArrayNotFilledException {

        int zufall;
        String card;

        Random random = new Random();

        zufall = random.nextInt(3);

        switch (zufall) {

            case 0:
                fillSoftCardsToArray();
                logger.info("Methode zum Befüllen der Karte mit Soft wird aufgerufen");


                card = neueListe.get(indexcounter);
                logger.info("Karte wird aus SoftArray ausgelesen");
                indexcounter++;
                logger.info("index wird um 1 erhöht damit die nächste Karte gezogen wird");
                break;


            case 1:
                fillHardCardsToArray();
                logger.info("Methode zum Befüllen der Karte mit Hard wird aufgerufen");


                card = neueListe.get(indexcounter);
                logger.info("Karte wird aus HardArray ausgelesen");
                indexcounter++;
                logger.info("index wird um 1 erhöht damit die nächste Karte gezogen wird");
                break;


            default:
                System.out.println("Es konnte leider keine Kategorie ermittelt werden");
                card = null;
                logger.error("es konnte keine Zufallszahl ermittelt werden");
        }


        logger.info("wählt eine Zufallskarte aus den Kategorien Soft und Hard: {}", card);
        return card;

    }

    protected List<String> neueListe;

    public void streamer(List<String> currentArray) {
        neueListe =
                currentArray.stream()
                        .parallel()
                        .distinct()
                        .collect(Collectors.toList());

        logger.info("Streaming abgeschlossen");

    }
}
