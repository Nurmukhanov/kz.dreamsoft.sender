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
public class SmsMsgQueue extends Domain {

    private String name;

    private Date dateToStart;

    private String status;

    @ManyToMany
    private Collection<MobNum> mobNums;

    @ManyToOne
    private SmsMessage smsMessage;

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

    public Collection<MobNum> getMobNums() {
        return mobNums;
    }

    public void setMobNums(Collection<MobNum> mobNums) {
        this.mobNums = mobNums;
    }

    public SmsMessage getSmsMessage() {
        return smsMessage;
    }

    public void setSmsMessage(SmsMessage smsMessage) {
        this.smsMessage = smsMessage;
    }
}
