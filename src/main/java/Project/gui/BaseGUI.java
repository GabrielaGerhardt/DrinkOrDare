package Project.gui;

import Project.Game;
import Project.generators.GeneratorFactory;
import Project.threads.BackgroundMusicThread;
import Project.threads.BackupCardsThread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class BaseGUI implements ActionListener {


    private static final Logger logger = LogManager.getLogger(BaseGUI.class);

    static Game game = new Game();


    String[] playerNames = new String[]{"", "", "", "", "", ""};

    int submitCount = 0;
    int playerCount = 0;


    // Main frame:

    JFrame frame = new JFrame();

    //Content for Difficulty:

    JButton soft = new JButton();
    JButton hard = new JButton();

    JLabel labelDiff = new JLabel("Choose a Difficulty!");

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();

    //Content for SetPlayers:

    JButton submit = new JButton();
    JButton back = new JButton();
    JButton next = new JButton();
    JButton delete1 = new JButton();
    JButton delete2 = new JButton();
    JButton delete3 = new JButton();
    JButton delete4 = new JButton();
    JButton delete5 = new JButton();
    JButton delete6 = new JButton();

    JTextField textField = new JTextField(20);

    JLabel labelPlayer = new JLabel("Add or remove Players!");
    JLabel name1 = new JLabel("");
    JLabel name2 = new JLabel("");
    JLabel name3 = new JLabel("");
    JLabel name4 = new JLabel("");
    JLabel name5 = new JLabel("");
    JLabel name6 = new JLabel("");

    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();

    // Content for Playbutton:

    JButton play = new JButton();
    JButton back2 = new JButton();

    JLabel clickPlay = new JLabel("Click play to start the game!");

    JPanel panel11 = new JPanel();
    JPanel panel12 = new JPanel();
    JPanel panel13 = new JPanel();
    JPanel panel14 = new JPanel();

    // Content for Card:

    JButton stopGame = new JButton();
    JButton nextChallenge = new JButton();

    JLabel name = new JLabel("NameOfPlayer");
    JLabel cardContent = new JLabel("RandomChallenge");
    JLabel rule = new JLabel("Löse die Challenge oder trink!");

    JPanel panel15 = new JPanel();
    JPanel panel16 = new JPanel();
    JPanel panel17 = new JPanel();
    JPanel panel18 = new JPanel();


    public BaseGUI() {


        //Difficulty Content Settings


        soft.setIcon(new ImageIcon("src/main/resources/images/softIcon.png"));
        soft.setBackground(Color.black);
        soft.addActionListener(this);

        hard.setIcon(new ImageIcon("src/main/resources/images/hardIcon.png"));
        hard.setBackground(Color.black);
        hard.addActionListener(this);

        labelDiff.setForeground(Color.white);

        panel.setBounds(0, 0, 1000, 200);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setBackground(Color.black);
        panel.add(labelDiff);

        panel2.setBounds(0, 200, 500, 800);
        panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel2.setBackground(Color.black);
        panel2.add(soft);

        panel3.setBounds(500, 200, 500, 800);
        panel3.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel3.setBackground(Color.black);
        panel3.add(hard);


        //Setplayer Content Settings:


        submit.setBackground(Color.black);
        submit.setIcon(new ImageIcon("src/main/resources/images/Submit.png"));
        submit.addActionListener(this);

        delete1.setBackground(Color.black);
        delete1.setIcon(new ImageIcon("src/main/resources/images/Delete.png"));
        delete1.addActionListener(this);
        delete1.setVisible(false);

        delete2.setBackground(Color.black);
        delete2.setIcon(new ImageIcon("src/main/resources/images/Delete.png"));
        delete2.addActionListener(this);
        delete2.setVisible(false);

        delete3.setBackground(Color.black);
        delete3.setIcon(new ImageIcon("src/main/resources/images/Delete.png"));
        delete3.addActionListener(this);
        delete3.setVisible(false);

        delete4.setBackground(Color.black);
        delete4.setIcon(new ImageIcon("src/main/resources/images/Delete.png"));
        delete4.addActionListener(this);
        delete4.setVisible(false);

        delete5.setBackground(Color.black);
        delete5.setIcon(new ImageIcon("src/main/resources/images/Delete.png"));
        delete5.addActionListener(this);
        delete5.setVisible(false);

        delete6.setBackground(Color.black);
        delete6.setIcon(new ImageIcon("src/main/resources/images/Delete.png"));
        delete6.addActionListener(this);
        delete6.setVisible(false);

        back.setBackground(Color.black);
        back.setIcon(new ImageIcon("src/main/resources/images/Back.png"));
        back.addActionListener(this);

        next.setBackground(Color.black);
        next.setIcon(new ImageIcon("src/main/resources/images/Next.png"));
        next.addActionListener(this);

        labelPlayer.setForeground(Color.white);
        labelPlayer.setSize(200, 100);

        textField.setBackground(Color.blue);
        textField.setForeground(Color.white);
        textField.setBounds(100, 120, 50, 50);

        name1.setForeground(Color.white);
        name2.setForeground(Color.white);
        name3.setForeground(Color.white);
        name4.setForeground(Color.white);
        name5.setForeground(Color.white);
        name6.setForeground(Color.white);

        panel4.setBounds(0, 0, 1000, 100);
        panel4.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel4.setBackground(Color.black);
        panel4.add(labelPlayer);
        panel4.setVisible(false);

        panel5.setBounds(0, 100, 1000, 200);
        panel5.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel5.setBackground(Color.black);
        panel5.add(textField);
        panel5.add(submit);
        panel5.setVisible(false);

        panel6.setBounds(0, 300, 500, 500);
        panel6.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel6.setBackground(Color.black);
        panel6.setVisible(false);
        panel6.setLayout(new GridLayout(6, 2));
        panel6.add(name1);
        panel6.add(name2);
        panel6.add(name3);
        panel6.add(name4);
        panel6.add(name5);
        panel6.add(name6);

        panel7.setBounds(500, 300, 500, 500);
        panel7.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel7.setBackground(Color.black);
        panel7.setVisible(false);
        panel7.setLayout(new GridLayout(6, 2));
        panel7.add(delete1);
        panel7.add(delete2);
        panel7.add(delete3);
        panel7.add(delete4);
        panel7.add(delete5);
        panel7.add(delete6);

        panel8.setBounds(0, 800, 200, 200);
        panel8.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel8.setBackground(Color.black);
        panel8.add(back);
        panel8.setVisible(false);

        panel9.setBounds(200, 800, 600, 200);
        panel9.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel9.setBackground(Color.black);
        panel9.setVisible(false);

        panel10.setBounds(800, 800, 200, 200);
        panel10.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel10.setBackground(Color.black);
        panel10.add(next);
        panel10.setVisible(false);


        //Playbutton Content Settings:


        back2.setBackground(Color.black);
        back2.setIcon(new ImageIcon("src/main/resources/images/Back.png"));
        back2.addActionListener(this);

        play.setBackground(Color.black);
        play.setIcon(new ImageIcon("src/main/resources/images/Playbutton.png"));
        play.addActionListener(this);
        play.setSize(1000, 1000);

        clickPlay.setForeground(Color.white);

        panel11.setBounds(0, 100, 1000, 700);
        panel11.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel11.setBackground(Color.black);
        panel11.add(play);
        panel11.setVisible(false);

        panel12.setBounds(0, 800, 200, 200);
        panel12.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel12.setBackground(Color.black);
        panel12.add(back2);
        panel12.setVisible(false);

        panel13.setBounds(200, 800, 800, 200);
        panel13.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel13.setBackground(Color.black);
        panel13.setVisible(false);

        panel14.setBounds(0, 0, 1000, 100);
        panel14.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel14.setBackground(Color.black);
        panel14.setVisible(false);
        panel14.add(clickPlay);


        //Card Content Settings:

        stopGame.setBackground(Color.decode("#FFB3FD"));
        stopGame.setIcon(new ImageIcon("src/main/resources/images/Stop.png"));
        stopGame.addActionListener(this);

        nextChallenge.setBackground(Color.decode("#FFB3FD"));
        nextChallenge.setIcon(new ImageIcon("src/main/resources/images/Next.png"));
        nextChallenge.addActionListener(this);

        name.setForeground(Color.black);
        cardContent.setForeground(Color.black);
        rule.setForeground(Color.black);

        panel15.setBounds(0, 500, 1000, 300);
        panel15.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel15.setBackground(Color.decode("#FFB3FD"));
        panel15.add(cardContent);
        panel15.setVisible(false);

        panel16.setBounds(0, 800, 1000, 200);
        panel16.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel16.setBackground(Color.decode("#FFB3FD"));
        panel16.add(stopGame);
        panel16.add(nextChallenge);
        panel16.setVisible(false);

        panel17.setBounds(0, 0, 1000, 200);
        panel17.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel17.setBackground(Color.decode("#FFB3FD"));
        panel17.add(name);
        panel17.setVisible(false);

        panel18.setBounds(0, 200, 1000, 300);
        panel18.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel18.setBackground(Color.decode("#FFB3FD"));
        panel18.add(rule);



        //Frame Content Settings


        frame.setLayout(null);
        frame.setSize(1000, 1000);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.CENTER);
        frame.add(panel4, BorderLayout.CENTER);
        frame.add(panel5, BorderLayout.CENTER);
        frame.add(panel7, BorderLayout.CENTER);
        frame.add(panel6, BorderLayout.CENTER);
        frame.add(panel8, BorderLayout.CENTER);
        frame.add(panel9, BorderLayout.CENTER);
        frame.add(panel10, BorderLayout.CENTER);
        frame.add(panel11, BorderLayout.CENTER);
        frame.add(panel12, BorderLayout.CENTER);
        frame.add(panel13, BorderLayout.CENTER);
        frame.add(panel14, BorderLayout.CENTER);
        frame.add(panel15, BorderLayout.CENTER);
        frame.add(panel16, BorderLayout.CENTER);
        frame.add(panel17, BorderLayout.CENTER);
        frame.add(panel18, BorderLayout.CENTER);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Drink or Dare");
        frame.setVisible(true);

        playMusic();

        backUpCards();


    }


    /**
     * Assigns an action to each button in the game.
     * Changes Scenes.
     *
     * @param e
     */

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == soft | e.getSource() == hard) {

            if (e.getSource() == soft) game.selectDifficulty(GeneratorFactory.Difficulty.SOFT);
            if (e.getSource() == hard) game.selectDifficulty(GeneratorFactory.Difficulty.HARD);


            panel.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);

            panel4.setVisible(true);
            panel5.setVisible(true);
            panel6.setVisible(true);
            panel7.setVisible(true);
            panel8.setVisible(true);
            panel9.setVisible(true);
            panel10.setVisible(true);

            logger.info("Soft Button wurde betätigt.");

        }

        if (e.getSource() == back) {

            panel4.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(false);
            panel7.setVisible(false);
            panel8.setVisible(false);
            panel9.setVisible(false);
            panel10.setVisible(false);

            panel.setVisible(true);
            panel2.setVisible(true);
            panel3.setVisible(true);

            logger.info("Back Button wurde betätigt.");


        }


        if (e.getSource() == next) {

            panel4.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(false);
            panel7.setVisible(false);
            panel8.setVisible(false);
            panel9.setVisible(false);
            panel10.setVisible(false);

            panel11.setVisible(true);
            panel12.setVisible(true);
            panel13.setVisible(true);
            panel14.setVisible(true);

            logger.info("Next Button wurde betätigt.");

        }

        if (e.getSource() == back2) {

            panel11.setVisible(false);
            panel12.setVisible(false);
            panel13.setVisible(false);
            panel14.setVisible(false);

            panel4.setVisible(true);
            panel5.setVisible(true);
            panel6.setVisible(true);
            panel7.setVisible(true);
            panel8.setVisible(true);
            panel9.setVisible(true);
            panel10.setVisible(true);


            logger.info("Back2 Button wurde betätigt.");
        }

        if (e.getSource() == play) {




            panel11.setVisible(false);
            panel12.setVisible(false);
            panel13.setVisible(false);
            panel14.setVisible(false);

            panel15.setVisible(true);
            panel16.setVisible(true);
            panel17.setVisible(true);
            panel18.setVisible(true);


            cardContent.setText(game.getGeneratorString());

            addPlayername();

            logger.info("Play Button wurde betätigt.");


        }

        if (e.getSource() == stopGame) {

            panel15.setVisible(false);
            panel16.setVisible(false);
            panel17.setVisible(false);
            panel18.setVisible(false);

            panel.setVisible(true);
            panel2.setVisible(true);
            panel3.setVisible(true);

            playerCount = 0;

            logger.info("stopGame Button wurde betätigt. Spiel wird neu gestartet.");
        }


        if (e.getSource() == submit) {

            if (playerNames[submitCount].length() <= 0 & textField.getText().length() > 0)
                playerNames[submitCount] = textField.getText();

            if (name6.getText().equals("") & textField.getText().length() > 0)submitCount++;

            if (submitCount == 6) submitCount = 0;

            name1.setText(playerNames[0]);
            name2.setText(playerNames[1]);
            name3.setText(playerNames[2]);
            name4.setText(playerNames[3]);
            name5.setText(playerNames[4]);
            name6.setText(playerNames[5]);

            if (name1.getText().length() > 0) delete1.setVisible(true);
            if (name2.getText().length() > 0) delete2.setVisible(true);
            if (name3.getText().length() > 0) delete3.setVisible(true);
            if (name4.getText().length() > 0) delete4.setVisible(true);
            if (name5.getText().length() > 0) delete5.setVisible(true);
            if (name6.getText().length() > 0) delete6.setVisible(true);

            logger.info("Submit Button wurde betätigt.");


        }

        if (e.getSource() == delete1) {

            deleteButton(0);

        }

        if (e.getSource() == delete2) {

            deleteButton(1);

        }

        if (e.getSource() == delete3) {

            deleteButton(2);

        }

        if (e.getSource() == delete4) {

            deleteButton(3);

        }

        if (e.getSource() == delete5) {

            deleteButton(4);

        }

        if (e.getSource() == delete6) {

            deleteButton(5);

        }

        if (e.getSource() == nextChallenge) {


            addPlayername();
            cardContent.setText(game.getGeneratorString());



        }




    }

    /**
     * Deletes entries from the array playerNames,
     * rearranges the entries and puts them in the correct order.
     * Removes Delete-Buttons.
     *
     * @param count
     */

    private void deleteButton(int count) {

        playerNames[count] = "";
        changePlayerNames(playerNames);

        if (submitCount == 0) {

            submitCount = 5;
        } else {
            submitCount--;
        }

        name1.setText(playerNames[0]);
        name2.setText(playerNames[1]);
        name3.setText(playerNames[2]);
        name4.setText(playerNames[3]);
        name5.setText(playerNames[4]);
        name6.setText(playerNames[5]);

        if (name1.getText().length() <= 0) delete1.setVisible(false);
        if (name2.getText().length() <= 0) delete2.setVisible(false);
        if (name3.getText().length() <= 0) delete3.setVisible(false);
        if (name4.getText().length() <= 0) delete4.setVisible(false);
        if (name5.getText().length() <= 0) delete5.setVisible(false);
        if (name6.getText().length() <= 0) delete6.setVisible(false);

        logger.info("Delete Button wurde betätigt.");

    }

    /**
     * Entries in an array move up, when other entries have been deleted.
     *
     * @param str
     */

    public void changePlayerNames(String[] str) {


        String[] result = new String[]{"", "", "", "", "", ""};
        int count = 0;

        for (int i = 0; i < str.length; i++) {

            if (str[i].length() > 0) {

                result[count] = str[i];
                count++;
            }


        }
        playerNames = result;
        logger.info("playerNames was rearranged.");
    }

    /**
     * Adds a player name from playerNames to the JLabel name, which is displayed above a Challenge on the Card.
     * Empty Strings will not be added.
     */

    public void addPlayername() {

        name.setText("Spieler an der Reihe: " + playerNames[playerCount]);
        playerCount++;
        if (playerCount == numberOfPlayers(playerNames)) playerCount = 0;

        logger.info("Playername was added to JLabel name.");
    }


    /**
     * Returns the actual number of entries in an array, without counting the empty strings.
     *
     * @param str
     * @return
     */

    public int numberOfPlayers(String[] str) {

        int num = 0;

        for (int i = 0; i < str.length; i++) {

            if (str[i].length() > 0) num++;
        }
        return num;
    }

    public void playMusic(){

        while (frame.isVisible()){

            BackgroundMusicThread musicThread = new BackgroundMusicThread();
            musicThread.run();

        }
    }

    public void backUpCards(){

        while (frame.isVisible()){


            ArrayList<String> challenges = new ArrayList<>();

            BackupCardsThread backupThread = new BackupCardsThread("dummy", challenges);
            backupThread.run();

        }
    }
}
