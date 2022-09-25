import java.lang.reflect.Array;

public class Main {
    // try-catch-finally
    public static void main(String[] args) {


        try{
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[2]);
        }catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        }
        finally {
            System.out.println("Finally Çalıştı.");
        }

    }
}
