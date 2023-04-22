public abstract class Animals {


    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name  %s; feed %s", name,feed());
    }
}
