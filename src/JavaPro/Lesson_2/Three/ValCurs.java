package JavaPro.Lesson_2.Three;
/*
Created by matua on 02.09.2018 at 21:43
*/

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class ValCurs {
    private Date date;
    private String name;
    private Currency currency;

    public ValCurs() {
    }

    public ValCurs(Date date, String name, Currency currency) {
        this.date = date;
        this.name = name;
        this.currency = currency;
    }

    public Date getDate() {
        return date;
    }

    @XmlAttribute
    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    @XmlAttribute
    public void setName(String name) {
        this.name = name;
    }

    public Currency getCurrency() {
        return currency;
    }

    @XmlElement
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
