public class Main {

    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product product = new Product();

        product.price = 0;
        product.name = "PC";

        productManager.add(product);



    }
}
