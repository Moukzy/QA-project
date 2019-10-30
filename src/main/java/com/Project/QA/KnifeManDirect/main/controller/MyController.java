package com.Project.QA.KnifeManDirect.main.controller;


import com.Project.QA.KnifeManDirect.main.data.Appointments;
import com.Project.QA.KnifeManDirect.main.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@CrossOrigin("*")
@RequestMapping("/appointment")
public class MyController {


    @Autowired
    private AppointmentService appServ;

    @GetMapping("/{id}")
    public Appointments findById(@PathVariable int id) {
        return appServ.findById(id);
    }


    @GetMapping
    public ArrayList<Appointments> showAllAppointments() {
        return appServ.findAll();
    }

    @PostMapping
    public String bookApp(@RequestBody Appointments app) {
        appServ.save(app);
        return "Appointment Booked!";
    }

    @PutMapping
    public String amendApp(@RequestBody Appointments app){
        appServ.amendApp(app);
        return "Appointment amended!";
    }

    @DeleteMapping("/{id}")
    public String deleteApp(@PathVariable int id) {
        return appServ.delete(id);
    }
}









