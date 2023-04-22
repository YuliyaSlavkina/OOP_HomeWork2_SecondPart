import java.util.ArrayList;
import java.util.List;

public class Terrarium {
    private List<Animals> listAnimal = new ArrayList<>();

    public List<Animals> getListAnimal(){
        return listAnimal;
    }
    public Terrarium addList (Animals animals){
        listAnimal.add(animals);
        return this;
    }

    public List<Walkable> walkables(){
        List<Walkable> walkables = new ArrayList<>();
        for (var item : listAnimal) {
            if(item instanceof Walkable)
                walkables.add((Walkable) item);
        }
        return walkables;
    }
    public List<Jumpable> jumpables(){
        List<Jumpable> jumpables = new ArrayList<>();
        for (var item : listAnimal) {
            if(item instanceof Jumpable)
                jumpables.add((Jumpable) item);
        }
        return jumpables;
    }

    public List<Swimable> swimables(){
        List<Swimable> swimables = new ArrayList<>();
        for (var item: listAnimal) {
            if(item instanceof Swimable)
                swimables.add((Swimable) item);
        }
        return swimables;
    }

    public Walkable winnerWalk(){
        int index = 0;
        for(int i=0; i < walkables().size(); i++){
            if(walkables().get(i).walkSpeed() > walkables().get(index).walkSpeed())
                index = i;
        }
        return walkables().get(index);
    }

    public Jumpable winnerJump(){
        int index = 0;
        for (int i = 0; i < jumpables().size(); i++) {
            if(jumpables().get(i).jumpSpeed()>jumpables().get(index).jumpSpeed())
                index = i;
        }
        return jumpables().get(index);
    }

    public Swimable winnerSwim(){
        int index = 0;
        for (int i = 0; i < swimables().size(); i++) {
            if(swimables().get(i).swimSpeed()>swimables().get(index).swimSpeed())
                index=i;
        }
        return swimables().get(index);
    }

}
