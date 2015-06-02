package kz.dreamsoft.sender.domain.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by olzhas on 5/23/15.
 */
@XmlRootElement
public class RequestToRegisterDTO {

    private String email;
    private String name;
    private String pwd;

    public RequestToRegisterDTO() {
    }

    public RequestToRegisterDTO(String email, String name, String pwd) {
        this.email = email;
        this.name = name;
        this.pwd = pwd;
    }

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
}
