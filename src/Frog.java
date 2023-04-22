public class Frog extends Predator implements Jumpable, Swimable{
    public Frog(String name) {
        super(name);
    }

    @Override
    public int jumpSpeed() {
        return 15;
    }

    @Override
    public int swimSpeed() {
        return 25;
    }
    @Override
    public String toString() {
        return String.format("Frog %s", super.toString());
    }
}
