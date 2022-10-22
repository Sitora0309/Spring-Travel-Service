package uz.edu.travelservice.exception;

public class TravelClubNotFoundException extends Exception{
    public TravelClubNotFoundException(){
        super();
    }

    public TravelClubNotFoundException(String message){
        super(message);
    }

    public TravelClubNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

    public TravelClubNotFoundException(Throwable cause){
        super(cause);
    }

    protected TravelClubNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
