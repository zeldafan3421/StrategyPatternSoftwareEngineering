package Animals;

import Animals.Behaviors.SilentBehavior;
import Animals.Behaviors.Diet.AquaticOmnivoreBehavior;
import Animals.Behaviors.Movement.SwimBehavior;

public class BalaShark extends Animal
{
    public BalaShark() 
    {
        super("Bala Shark", new SwimBehavior(), new AquaticOmnivoreBehavior(), new SilentBehavior());
    }
}
