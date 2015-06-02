package kz.dreamsoft.sender.domain;


import javax.persistence.Entity;

/**
 * Created by olzhas on 5/27/15.
 */
@Entity
public class EmailList extends Domain{

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
