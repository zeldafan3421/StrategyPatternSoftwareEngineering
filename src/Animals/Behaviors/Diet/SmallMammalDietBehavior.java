package Animals.Behaviors.Diet;

import java.util.Random;

import client.ZooGUI;

public class SmallMammalDietBehavior implements DietBehavior
{
    private final static String[] choices = 
    {
        "rat",
        "small lizard",
        "fish"
    };

    @Override
    public void eat()
    {
        Random generator = new Random();
        String template = "eating a %s...";
        String choice = choices[generator.nextInt(choices.length)];

        ZooGUI.setMessage(String.format(template, choice));
    }
}
