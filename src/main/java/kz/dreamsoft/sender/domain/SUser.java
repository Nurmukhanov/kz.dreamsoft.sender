package kz.dreamsoft.sender.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.List;

/**
 * Created by olzhas on 5/6/15.
 */
@Entity
public class SUser extends Domain{

    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> roles;

    private String userName;

    private String pwd;


    @ManyToMany
    private Collection<Email> emails;

    @ManyToMany
    private Collection<MobNum> mobNums;

    @ManyToMany
    private Collection<EmailMsgQueue> emailMsgQueues;

    @ManyToMany
    private Collection<EmailMessage> emailMessages;

    @ManyToMany
    private Collection<SmsMsgQueue> smsMsgQueues;

    @ManyToMany
    private Collection<SmsMessage> smsMessages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Collection<Email> getEmails() {
        return emails;
    }

    public void setEmails(Collection<Email> emails) {
        this.emails = emails;
    }

    public Collection<MobNum> getMobNums() {
        return mobNums;
    }

    public void setMobNums(Collection<MobNum> mobNums) {
        this.mobNums = mobNums;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Collection<EmailMsgQueue> getEmailMsgQueues() {
        return emailMsgQueues;
    }

    public void setEmailMsgQueues(Collection<EmailMsgQueue> emailMsgQueues) {
        this.emailMsgQueues = emailMsgQueues;
    }

    public Collection<EmailMessage> getEmailMessages() {
        return emailMessages;
    }

    public void setEmailMessages(Collection<EmailMessage> emailMessages) {
        this.emailMessages = emailMessages;
    }

    public Collection<SmsMsgQueue> getSmsMsgQueues() {
        return smsMsgQueues;
    }

    public void setSmsMsgQueues(Collection<SmsMsgQueue> smsMsgQueues) {
        this.smsMsgQueues = smsMsgQueues;
    }

    public Collection<SmsMessage> getSmsMessages() {
        return smsMessages;
    }

    public void setSmsMessages(Collection<SmsMessage> smsMessages) {
        this.smsMessages = smsMessages;
    }
}
