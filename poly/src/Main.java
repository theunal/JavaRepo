public class Main {

    public static void main(String[] args) {


        emailLogger emailLogger = new emailLogger();
        fileLogger fileLogger = new fileLogger();
        dataBaseLogger dataBaseLogger = new dataBaseLogger();
//        BaseLogger[] baseLogger = new BaseLogger[]{emailLogger,fileLogger,dataBaseLogger};
//        for (BaseLogger logger : baseLogger) {
//            logger.log("Log mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(fileLogger);
        customerManager.add();

    }
}
