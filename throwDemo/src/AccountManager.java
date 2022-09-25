public class AccountManager {

    private double bakiye;

    public void parayatir(double sayi) {
        bakiye = getBakiye() + sayi;
    }

    public void paracek(double sayi) throws YetersizBakiyeExpection{
        if(bakiye>=sayi) {
            bakiye = getBakiye() - sayi;
        }else{
            throw new YetersizBakiyeExpection("Bakiye yetersiz.");
        }

    }


    public double getBakiye() {
        return bakiye;
    }
}
