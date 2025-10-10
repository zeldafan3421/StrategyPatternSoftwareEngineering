package Animals.Behaviors;

import client.ZooGUI;

public class RoarBehavior implements SoundBehavior
{
    @Override
    public void makeSound()
    {
        ZooGUI.setMessage("Roarrrr...");
    }
}
