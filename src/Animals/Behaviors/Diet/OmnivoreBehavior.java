package Animals.Behaviors.Diet;

import client.ZooGUI;

public class OmnivoreBehavior implements DietBehavior
{
    @Override 
    public void eat()
    {
        ZooGUI.setMessage("Eating nuts, seeds and maybe meat.");
    }
}
