package Animals;

import Animals.Behaviors.HootBehavior;
import Animals.Behaviors.Diet.SmallMammalDietBehavior;
import Animals.Behaviors.Movement.FlyBehavior;

public class Owl extends Animal
{
    public Owl() 
    {
        super(
            "Owl", 
            new FlyBehavior(), 
            new SmallMammalDietBehavior(), 
            new HootBehavior()
            );
    }
}
