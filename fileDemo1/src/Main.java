import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFile();
        writeFile();
        readFile();
    }


    public static void getFile() {
        File file = new File("C:\\fileDemo1\\eleman.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else
                System.out.println("Dosya zaten var.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\fileDemo1\\eleman.txt");
        if (file.exists()) {
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yolu: " + file.getPath());
            System.out.println("Dosya space: " + file.getFreeSpace());
            System.out.println("Dosya yazılabilir mi: " + file.canWrite());
            System.out.println("Dosya okunabilir mi: " + file.canRead());
            System.out.println("Dosya ? mi: " + file.canExecute());
            System.out.println("Dosya boyutu: " + file.length());

        }

    }

    public static void readFile() {

        File file = new File("C:\\fileDemo1\\eleman1.txt");

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }


    }

    public static void writeFile() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\fileDemo1\\eleman1.txt",true));
            bufferedWriter.newLine();
            bufferedWriter.write("SDU EHM");
            System.out.println("dosyaya yazıldı.");
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
