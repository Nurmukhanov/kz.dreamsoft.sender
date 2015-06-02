package kz.dreamsoft.sender.exception;


/**
 * Created by olzhas on 5/23/15.
 */
public class RequestAlreadyCreated extends Exception {

    public RequestAlreadyCreated() {
        super("Email exists");
    }
}
