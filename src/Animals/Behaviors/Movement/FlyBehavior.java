package Animals.Behaviors.Movement;

import client.ZooGUI;

public class FlyBehavior implements MovementBehavior
{
    @Override
    public void move() 
    {
        ZooGUI.setMessage("Flying gracefully across the sky.");
    }

}
