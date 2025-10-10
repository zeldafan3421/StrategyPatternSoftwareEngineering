package Animals.Behaviors;

import client.ZooGUI;

public class HootBehavior implements SoundBehavior
{
    @Override
    public void makeSound()
    {
        ZooGUI.setMessage("Hoot, Hoot.");
    }
}
