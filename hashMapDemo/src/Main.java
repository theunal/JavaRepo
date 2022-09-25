
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer,String> sozluk = new HashMap<>();

        sozluk.put(1,"anahtar");
        sozluk.put(3,"fare");
        sozluk.put(5,"araba");

        System.out.println(sozluk.size());

        System.out.println(sozluk.get(6));
            for (int kel : sozluk.keySet()) {

                System.out.println("Anahtar:"+kel+" >> Value:"+sozluk.get(kel));

            }



    }
}
