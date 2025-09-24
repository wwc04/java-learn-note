package Exception;

public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException(){

    }
    public AgeIllegalRuntimeException(String message){
        super(message);
    }
}
