package kz.dreamsoft.sender.domain;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Collection;
import java.util.Date;

/**
 * Created by olzhas on 5/26/15.
 */
@Entity
public class EmailMsgQueue extends Domain {

    private String name;

    private Date dateToStart;

    private String status;

    @ManyToMany
    private Collection<Email> emails;

    @ManyToOne
    private EmailMessage emailMessage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateToStart() {
        return dateToStart;
    }

    public void setDateToStart(Date dateToStart) {
        this.dateToStart = dateToStart;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Collection<Email> getEmails() {
        return emails;
    }

    public void setEmails(Collection<Email> emails) {
        this.emails = emails;
    }

    public EmailMessage getEmailMessage() {
        return emailMessage;
    }

    public void setEmailMessage(EmailMessage emailMessage) {
        this.emailMessage = emailMessage;
    }
}
