package Animals;

import Animals.Behaviors.SilentBehavior;
import Animals.Behaviors.Diet.AquaticOmnivoreBehavior;
import Animals.Behaviors.Movement.SwimBehavior;

public class RedBelliedPiranha extends Animal
{

    public RedBelliedPiranha() 
    {
        super("Red-Bellied Piranha", new SwimBehavior(), new AquaticOmnivoreBehavior(), new SilentBehavior());
    }

}
