public class YetersizBakiyeExpection extends Exception{

    String message;

    public YetersizBakiyeExpection(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
