package uz.edu.travelservice.exception;

public class MembershipNotFoundException extends Exception{

    public MembershipNotFoundException(){
        super();
    }

    public MembershipNotFoundException(String message){
        super(message);
    }
    public MembershipNotFoundException(String message,Throwable cause){
        super(message, cause);
    }

    public MembershipNotFoundException(Throwable cause){
        super(cause);
    }

    protected MembershipNotFoundException(String message,Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
