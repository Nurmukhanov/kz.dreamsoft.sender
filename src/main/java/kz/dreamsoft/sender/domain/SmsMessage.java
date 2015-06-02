package kz.dreamsoft.sender.domain;

import kz.dreamsoft.sender.domain.enums.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by olzhas on 5/6/15.
 */

@Entity
public class SmsMessage extends Domain implements Serializable {

    private String msg;

    @Temporal(TemporalType.DATE)
    private Date createdtime;


    private String msgtype;

    @Enumerated(EnumType.STRING)
    private Status status;
    //Getters and Setters


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }


    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
