import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> sehirler =  new ArrayList<>();

        sehirler.add("BURSA");
        sehirler.add("İSTANBUL");
        sehirler.add("ANKARA");
        sehirler.add("İZMİR");

        Collections.sort(sehirler);
        System.out.println("-------------------------------------------------");
        for (String x : sehirler) {

            System.out.println(x);
        }


    }
}
