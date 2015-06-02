package kz.dreamsoft.sender.domain;

/**
 * Created by olzhas on 5/6/15.
 */
import javax.persistence.Entity;
import java.io.Serializable;


@Entity
public class Email extends Domain implements Serializable {

    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
