public interface DietBehavior 
{
    public default void eat()
    {
        System.out.println("Unimplemented behavior.");
    }
}
