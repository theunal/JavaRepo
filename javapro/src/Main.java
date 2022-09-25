import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Product product = new Product("PC","ASUS LAPTOP",108844968,800,3,"siyah");
        product.setName("PC");
        product.setTanim("ASUS LAPTOP");
        product.setId(108844968);
        product.setPrice(800);
        product.setStok(3);
        product.setRenk("yeşil");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
        System.out.println(product.getRenk());

    }



}
