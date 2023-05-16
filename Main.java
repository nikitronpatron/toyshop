import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Shop shop = new Shop(); 
        shop.put("prizes"); 
        shop.add(5, "keychain", 8); 
        shop.changeFrequency(6,60); 
        System.out.println(shop);

        Lottery Lottery = new Lottery(shop);

        Draw winningToys = new Draw(); 
        winningToys.draw(10, Lottery); 
        winningToys.writeToys("winningToys"); 
        System.out.println(winningToys);
    }
}