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

    public void setDietBehavior(DietBehavior dietBehavior)
    {
        this.dietBehavior = dietBehavior;
    }

    public void setMovementBehavior(SoundBehavior soundBehavior)
    {
        this.soundBehavior = soundBehavior;
    }

    public void setSoundBehavior(MovementBehavior  movementBehavior)
    {
        this.movementBehavior = movementBehavior;
    }
}
