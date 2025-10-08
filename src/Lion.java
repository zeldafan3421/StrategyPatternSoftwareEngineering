public class Lion extends Animal
{
    public Lion() {
        super(new WalkMovementBehavior(), new DietBehavior() {}, new SoundBehavior() {});
    }

}
