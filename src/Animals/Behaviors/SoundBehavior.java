package Animals.Behaviors;
public interface SoundBehavior 
{
    public default void makeSound()
    {
        System.out.println("Unimplemented behavior.");
    }
}
