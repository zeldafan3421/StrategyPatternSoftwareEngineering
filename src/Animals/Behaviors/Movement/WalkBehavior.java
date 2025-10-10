package Animals.Behaviors.Movement;

import client.ZooGUI;

public class WalkBehavior implements MovementBehavior
{
    @Override
    public void move()
    {
        ZooGUI.setMessage("walking");
    }
}
