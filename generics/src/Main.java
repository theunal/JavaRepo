import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String mat(String str) {


        var arr = str.split("");
        for (String x : arr) {
            if (Integer.parseInt(x) % 2 != 0) {
                return "false";
            }
        }
        return "true";
    }


    public static void main(String[] args) {

        System.out.println(mat("222222222222222"));


    }


}
