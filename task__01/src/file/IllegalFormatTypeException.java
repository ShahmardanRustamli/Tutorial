package file;

import factory.IllegalNotificationTypeException;

public class IllegalFormatTypeException extends RuntimeException{
    public IllegalFormatTypeException(String message){
        super(message);
    }
}
