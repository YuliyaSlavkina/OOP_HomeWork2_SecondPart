public class Spider extends Predator implements Walkable, Jumpable{


    public Spider(String name) {
        super(name);
    }

    @Override
    public int jumpSpeed() {
        return 5;
    }

    @Override
    public int walkSpeed() {
        return 2;
    }

    @Override
    public String toString() {
        return String.format("Spider %s", super.toString());
    }
}
