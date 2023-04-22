public class Crocodile extends Predator implements Walkable, Swimable{
    public Crocodile(String name) {
        super(name);
    }

    @Override
    public int swimSpeed() {
        return 30;
    }

    @Override
    public int walkSpeed() {
        return 25;
    }
    @Override
    public String toString() {
        return String.format("Crocodile %s", super.toString());
    }
}
