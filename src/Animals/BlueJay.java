package Animals;

import Animals.Behaviors.HootBehavior;
import Animals.Behaviors.Diet.OmnivoreBehavior;
import Animals.Behaviors.Movement.FlyBehavior;

public class BlueJay extends Animal 
{
    public BlueJay() 
    {
        super(
            "Blue Jay", 
            new FlyBehavior(), 
            new OmnivoreBehavior(), 
            new HootBehavior()
            );
    }
}
