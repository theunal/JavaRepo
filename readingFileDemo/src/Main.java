import java.io.*;

public class Main {


    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        int toplam = 0;
        String satir = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\javaprojeler\\readingFileDemo\\src\\text.txt"));
            System.out.println("Dosya bulundu.");

            while ( (satir = bufferedReader.readLine())  != null) {
                toplam = toplam+Integer.parseInt(satir);
            }
            System.out.println(toplam);

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        }
        catch (IOException e) {
            System.out.println(e);
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }



}

