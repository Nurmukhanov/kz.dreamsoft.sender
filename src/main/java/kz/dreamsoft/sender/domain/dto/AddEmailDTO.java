package kz.dreamsoft.sender.domain.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by olzhas on 5/27/15.
 */
@XmlRootElement
public class AddEmailDTO {

    private List<String> emails;

    public AddEmailDTO(){
    }

    public AddEmailDTO(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }
}
