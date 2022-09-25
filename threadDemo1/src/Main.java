public class Main {

    public static void main(String[] args) {

        KkronometreThread thread1 = new KkronometreThread("thread1");
        KkronometreThread thread2 = new KkronometreThread("thread2");
        KkronometreThread thread3 = new KkronometreThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
