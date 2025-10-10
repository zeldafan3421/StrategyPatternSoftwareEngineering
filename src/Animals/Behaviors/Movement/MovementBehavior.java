package Animals.Behaviors.Movement;

public interface MovementBehavior 
{
    public default void move()
    {
        System.out.println("Unimplemented behavior.");
    }
}
