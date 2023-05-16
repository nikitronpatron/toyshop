import java.util.*;

public class Lottery {
    private final Queue<Toy> toysQueue;


    public Lottery(Shop Toys) {
        ArrayList<Toy> playableToys = new ArrayList<>();
        toysQueue = new LinkedList<>();
        for (Toy toy : Toys.getToys()) {
            for (int i = 0; i < toy.getFrequency(); i++) {
                playableToys.add(toy);
            }
        }
        Collections.shuffle(playableToys);
        toysQueue.addAll(playableToys);
    }


    public int size() {
        return toysQueue.size();
    }


    public Toy poll() {
        return toysQueue.poll();
    }
}