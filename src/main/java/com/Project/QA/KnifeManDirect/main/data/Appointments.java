package com.Project.QA.KnifeManDirect.main.data;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Appointments {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String appDate;
    private String timeSlot;

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

    public String getAppDate() {
        return appDate;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
}
