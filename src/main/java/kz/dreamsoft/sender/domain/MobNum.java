package kz.dreamsoft.sender.domain;

/**
 * Created by olzhas on 5/6/15.
 */
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class MobNum extends Domain implements Serializable {

    private String mobNumb;
    private String operator;

    public String getMobNumb() {
        return mobNumb;
    }

    public void setMobNumb(String mobNumb) {
        this.mobNumb = mobNumb;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
