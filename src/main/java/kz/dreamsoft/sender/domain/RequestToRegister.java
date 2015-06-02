package kz.dreamsoft.sender.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by olzhas on 5/23/15.
 */
@Entity
public class RequestToRegister extends Domain {

    @Column(unique = true)
    private String email;

    private String name;

    private String pwd;

    @Column(unique = true)
    private String url;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
