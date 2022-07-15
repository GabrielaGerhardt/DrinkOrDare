package Project;

import Project.abstractClasses.CardGenerator;
import Project.generators.HardGenerator;
import Project.generators.SoftGenerator;
import Project.gui.BaseGUI;
import Project.exceptions.ArrayNotFilledException;
import Project.generators.GeneratorFactory;
import Project.interfaces.IGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Game{

    private static final Logger logger = LogManager.getLogger(Game.class);

    GeneratorFactory genFactory = new GeneratorFactory();

    IGenerator generator;

    GeneratorFactory.Difficulty difficulty;

    CardGenerator cardGenerator = new CardGenerator() {
        @Override
        public List<String> fillSoftCardsToArray() throws ArrayNotFilledException {
            return super.fillSoftCardsToArray();
        }
    };

    ArrayList<String> challenges = new ArrayList<>();




    public void selectDifficulty (GeneratorFactory.Difficulty diff){

        difficulty = diff;
        generator = genFactory.getCardGenerator(diff);
    }

    public String getGeneratorString(){

        SoftGenerator soft = new SoftGenerator();
        HardGenerator hard = new HardGenerator();

        String result = "";
        List<String> liste = soft.fillSoftCardsToArray();

        try{
            if(difficulty == GeneratorFactory.Difficulty.SOFT){ liste = soft.fillSoftCardsToArray();}
            if(difficulty == GeneratorFactory.Difficulty.HARD){ liste = hard.fillHardCardsToArray();}
        }
        catch(Exception e){

            System.out.println(e);
            throw e;

        }

        challenges.add(liste.get(0));

        return liste.get(0);
    }

    public static void main(String[] args){

    new BaseGUI();







    IGenerator generator = new IGenerator() {
        @Override
        public List<String> fillSoftCardsToArray() throws ArrayNotFilledException {
            return null;
        }

        @Override
        public List<String> fillHardCardsToArray() throws ArrayNotFilledException {
            return null;
        }

        @Override
        public String randomTask() throws FileNotFoundException, ArrayNotFilledException {
            return null;
        }

        @Override
        public void streamer(List<String> currentArray) {

        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
    };





}
}