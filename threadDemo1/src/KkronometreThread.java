public class KkronometreThread implements Runnable {

    private Thread thread;
    private String threadName;


    public KkronometreThread(String threadName) {
        System.out.println("oluşturuluyor:" + threadName);

    }

    @Override
    public void run() {
        System.out.println("calıştırılıyor:" + threadName);

        try {
            for (int i = 0; i < 10; i++) {

                System.out.println(threadName + " " + i);
                Thread.sleep(1000);
            }

        } catch (Exception e) {

            System.out.println("kesildi:" + e);
        }
        System.out.println("thread bitti:" + threadName);
    }

    public void start() {

        System.out.println("thread oluşturuluyor.");
            thread = new Thread(this, threadName);
            thread.start();


    }


}
