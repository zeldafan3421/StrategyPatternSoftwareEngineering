package Animals.Behaviors.Movement;

import client.ZooGUI;

public class SwimBehavior implements MovementBehavior
{
    @Override
    public void move()
    {
        ZooGUI.setMessage("Swimming through the water.");
    }
}
