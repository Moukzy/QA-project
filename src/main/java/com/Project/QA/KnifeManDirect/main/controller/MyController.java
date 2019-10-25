package com.Project.QA.KnifeManDirect.main.controller;


import com.Project.QA.KnifeManDirect.main.data.Appointments;
import com.Project.QA.KnifeManDirect.main.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class MyController {


    @Autowired
    private AppointmentService appServ;

    @GetMapping("/findById/{id}")
    public Appointments findById(@PathVariable int id) {
        return appServ.findById(id);
    }


    @GetMapping("/showAllAppointment")
    public ArrayList<Appointments> showAllAppointments() {
        return appServ.findAll();
    }

    @GetMapping("/findByDate/{date}")
    public ArrayList<Appointments> findByDate(@PathVariable Date date) {

        return appServ.findByAppDate(date);
    }

    @GetMapping("/findByDateAndTimeSlot/{date}/{time_slot}")
    public Appointments findByDateAndTimeSlot(@PathVariable Date date, @PathVariable int time_slot) {
        return appServ.findByAppDateAndTimeSlot(date, time_slot);
    }

    @PostMapping("/book")
    public String bookApp(@RequestBody Appointments app) {
        appServ.save(app);
        return "Appointment Booked!";

    }

    @DeleteMapping("/delete/{id}")
    public String deleteApp(@PathVariable int id) {
        return appServ.delete(id);


    }
}









