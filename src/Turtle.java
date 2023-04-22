public class Turtle extends Omnivore implements Swimable, Walkable{
    public Turtle(String name) {
        super(name);
    }

    @Override
    public int swimSpeed() {
        return 7;
    }

    @Override
    public int walkSpeed() {
        return 1;
    }
    @Override
    public String toString() {
        return String.format("Turtle %s", super.toString());
    }
}
