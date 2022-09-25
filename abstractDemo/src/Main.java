public class Main {

    public static void main(String[] args) {

       CustomerManager customerManager = new CustomerManager();
       customerManager.baseManager = new MySqlManager();
       customerManager.getCustomers();


    }
}
