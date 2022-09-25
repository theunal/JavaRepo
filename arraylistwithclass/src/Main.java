import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();



        customers.add(new Customer(10,"YUSUF",22));
        customers.add(new Customer(25,"SEZ",54));
        customers.add(new Customer(19,"MUN",44));

        customers.remove(new Customer(10,"YUSUF",22));

        for (Customer customer : customers) {
            System.out.println(customer.name);

        }

    }
}
