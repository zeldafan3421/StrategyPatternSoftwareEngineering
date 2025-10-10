package Animals.Behaviors;

import client.ZooGUI;

public class SilentBehavior implements SoundBehavior
{
    @Override
    public void makeSound()
    {
        ZooGUI.setMessage("Silence");
    }
}
