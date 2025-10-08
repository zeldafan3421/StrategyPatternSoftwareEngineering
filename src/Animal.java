public abstract class Animal 
{
    private MovementBehavior movementBehavior;
    private DietBehavior dietBehavior;
    private SoundBehavior soundBehavior;

    protected Animal(
        MovementBehavior movementBehavior, 
        DietBehavior dietBehavior, 
        SoundBehavior soundBehavior
    )
    {
        this.dietBehavior = dietBehavior;
        this.movementBehavior = movementBehavior;
        this.soundBehavior = soundBehavior;
    }

    public void performMove()
    {
        movementBehavior.move();
    }

    public void performSound()
    {
        soundBehavior.makeSound();
    }

    public void performEat()
    {
        dietBehavior.eat();
    }

    public void setDietBehavior()
    {
        
    }
}
