package Animals;

import Animals.Behaviors.RoarBehavior;
import Animals.Behaviors.Diet.CarnivoreBehavior;
import Animals.Behaviors.Movement.WalkBehavior;

public class CongoLion extends Animal
{
    public CongoLion() 
    {
        super("Congo Lion", new WalkBehavior(), new CarnivoreBehavior(), new RoarBehavior());
    }
}
