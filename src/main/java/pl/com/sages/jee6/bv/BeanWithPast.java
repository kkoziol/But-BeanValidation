package pl.com.sages.jee6.bv;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;


public class BeanWithPast {

    @Past
    private LocalDate date;

    @Past(message="{pl.com.sages.jee6.bv.Past}")
    private LocalDateTime dateTime;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

}