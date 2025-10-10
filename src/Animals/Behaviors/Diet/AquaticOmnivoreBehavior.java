package Animals.Behaviors.Diet;

import client.ZooGUI;

public class AquaticOmnivoreBehavior implements DietBehavior
{
    @Override
    public void eat()
    {
        ZooGUI.setMessage("Eating underwater plants and creatures.");
    }
}
