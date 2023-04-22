public class Main {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addList(new Spider("Tom"))
                .addList(new Frog("CrazyFrog"))
                .addList(new Turtle("Jollier"))
                .addList(new Crocodile("Dandy"));

        System.out.println("В нашем террариуме находятся:");
        for (var item : terrarium.getListAnimal()) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("Умеют ходить:");
        for (var item : terrarium.walkables()) {
            System.out.printf("%s  - %d\n", item.toString(), item.walkSpeed());
        }

        System.out.println();
        System.out.println("Умеют прыгать:");
        for (var item : terrarium.jumpables()) {
            System.out.printf("%s  -  %d\n", item.toString(), item.jumpSpeed());
        }
        System.out.println();
        System.out.println("Умеют плавать:");
        for (var item : terrarium.swimables()) {
            System.out.printf("%s  -  %d\n", item.toString(), item.swimSpeed());
        }
        System.out.println();
        System.out.println("Победитедь в прыжках:");
        System.out.println("Winner: " + terrarium.winnerJump());
        System.out.println();
        System.out.println("Быстрее всех ходит:");
        System.out.println("Winner: " + terrarium.winnerWalk());
        System.out.println();
        System.out.println("Быстрее всех плавает:");
        System.out.println("Winner: " + terrarium.winnerSwim());
    }
}