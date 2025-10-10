package Animals;

import Animals.Behaviors.SoundBehavior;
import Animals.Behaviors.Diet.DietBehavior;
import Animals.Behaviors.Movement.MovementBehavior;

public abstract class Animal
{
    private String name;
    private MovementBehavior movementBehavior;
    private DietBehavior dietBehavior;
    private SoundBehavior soundBehavior;

    protected Animal(
        String name,
        MovementBehavior movementBehavior, 
        DietBehavior dietBehavior, 
        SoundBehavior soundBehavior
    )
    {
        this.name = name;
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

    public String toString()
    {
        return name;
    }
}
