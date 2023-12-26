package Exceptions;

public class IncorrectPlaceException extends RuntimeException{
    public IncorrectPlaceException(){

    }

    public IncorrectPlaceException(String message){
        super(message);
    }
}
