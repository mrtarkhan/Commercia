package ir.commercia.coreDomain;

public class DomainException extends Exception{

    private  String message;

    public DomainException(String message) {
        this.message = message;
    }

}
