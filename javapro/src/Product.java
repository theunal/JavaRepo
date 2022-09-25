public class Product {


    public Product(String name,String tanim,int id,int price,int stok,String renk) {
        this.name = name;
        this.tanim = tanim;
        this.id = id;
        this.price = price;
        this.stok = stok;
        this.renk = renk;

        System.out.println("Yapıcı blok çalıştı");

    }
    public Product() {

    }


    private String name;
    private String tanim;
    private int id;
    private int price;
    private int stok;
    private String renk;
    private String kod;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTanim() {
        return tanim;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return "Ürün Kodu: " + this.name.charAt(0) + id;
    }


}
