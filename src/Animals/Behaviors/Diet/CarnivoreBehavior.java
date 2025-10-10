package Animals.Behaviors.Diet;

import client.ZooGUI;

public class CarnivoreBehavior implements DietBehavior
{
    @Override
    public void eat()
    {
        ZooGUI.setMessage("Eating meat.");
    }
}
