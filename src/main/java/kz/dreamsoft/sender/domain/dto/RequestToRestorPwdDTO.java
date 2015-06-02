package kz.dreamsoft.sender.domain.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by olzhas on 5/26/15.
 */
@XmlRootElement
public class RequestToRestorPwdDTO {
    private String email;

    public RequestToRestorPwdDTO(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
