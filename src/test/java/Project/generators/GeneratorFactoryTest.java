package Project.generators;

import Project.interfaces.IGenerator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratorFactoryTest {

    private IGenerator generatorFactorySoft = GeneratorFactory.getCardGenerator(GeneratorFactory.Difficulty.SOFT);
    private IGenerator generatorFactoryHard = GeneratorFactory.getCardGenerator(GeneratorFactory.Difficulty.HARD);


    //Factory Test
    @Test
    public void getCardGeneratorTestSober() {
        assertTrue(generatorFactorySoft instanceof SoftGenerator);
    }

    @Test
    public void getCardGeneratorTestDrunk() {
        assertTrue(generatorFactoryHard instanceof HardGenerator);
    }
}
