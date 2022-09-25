public class ProductManager {

    public void add(Product product) {

        if (ProductValidator.isValid(product)) {
            System.out.println("Geçerli.");
        }else
            System.out.println("Müşteri bilgisi geçersiz.");



    }



}
