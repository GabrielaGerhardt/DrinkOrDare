package Project.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class BackupCardsThread extends Thread {

    private String card;
    private ArrayList<String> challenges;

    public BackupCardsThread(String card, ArrayList<String> challenges) {
        super();
        this.card = card;
        this.challenges = challenges;

    }

    private static final Logger logger = LogManager.getLogger(BackupCardsThread.class);


    @Override
    public void run() {

        logger.info("Backup Thread gestartet.");
    }
}

