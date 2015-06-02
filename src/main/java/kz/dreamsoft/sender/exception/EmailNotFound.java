package kz.dreamsoft.sender.exception;

/**
 * Created by olzhas on 5/26/15.
 */
public class EmailNotFound extends Exception {
    public EmailNotFound(){
        super("Email not found");
    }
}
