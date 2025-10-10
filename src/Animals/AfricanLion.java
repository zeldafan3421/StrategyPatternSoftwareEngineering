package Animals;

import Animals.Behaviors.SilentBehavior;
import Animals.Behaviors.Diet.CarnivoreBehavior;
import Animals.Behaviors.Movement.WalkBehavior;

public class AfricanLion extends Animal
{
    public AfricanLion() 
    {
        super("African Lion", new WalkBehavior(), new CarnivoreBehavior(), new SilentBehavior());
    }
}
