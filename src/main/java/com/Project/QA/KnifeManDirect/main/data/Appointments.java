package com.Project.QA.KnifeManDirect.main.data;

import javax.persistence.*;
import java.util.Date;

@Entity

public class Appointments {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Date appDate;
    private int timeSlot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(int timeSlot) {
        this.timeSlot = timeSlot;
    }
}
