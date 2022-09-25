public class Main {

    public static void main(String[] args){

        AccountManager accountManager = new AccountManager();
        System.out.println("Bakiye: "+accountManager.getBakiye());

        accountManager.parayatir(500);
        System.out.println("Bakiye: "+accountManager.getBakiye());

        try{
            accountManager.paracek(260);
        }catch (YetersizBakiyeExpection e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Bakiye: "+accountManager.getBakiye());

        try{
            accountManager.paracek(241);
        }catch (YetersizBakiyeExpection e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Bakiye: "+accountManager.getBakiye());
        try{
            accountManager.paracek(200);
        }catch (YetersizBakiyeExpection e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Bakiye: "+accountManager.getBakiye());
    }
}
