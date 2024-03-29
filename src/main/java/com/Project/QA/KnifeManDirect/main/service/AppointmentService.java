package com.Project.QA.KnifeManDirect.main.service;


import com.Project.QA.KnifeManDirect.main.Repository.AppointmentsRepo;
import com.Project.QA.KnifeManDirect.main.data.Appointments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentsRepo repo;

    public ArrayList<String> findAllNames() {
        ArrayList<String> all_Names = new ArrayList<>();
        for (Appointments A : repo.findAll()) {
            all_Names.add(A.getName());

        }
        return all_Names;
    }

    public ArrayList<Appointments> findAll() {
      //  return repo.findAll();
        return repo.findByOrderByIdAsc();
    }

    public Appointments findById(Integer id) {
        return repo.getOne(id);
    }

    public ArrayList<Appointments> findByAppDate(String appDate) {

        return repo.findByAppDate(appDate);
    }

    public Appointments findByAppDateAndTimeSlot(String appDate, String slot) {

        return repo.findByAppDateAndTimeSlot(appDate, slot);
    }

    public void save(Appointments app) {
        repo.save(app);
    }
    public void amendApp(Appointments app){
        Appointments amending = findById(app.getId());
        amending.setName(app.getName());
        amending.setAppDate((app.getAppDate()));
        amending.setTimeSlot(app.getTimeSlot());
        repo.save(amending);
    }


    public String delete(int id) {
        Appointments file = findById(id);
        if (file != null) {
            repo.delete(file);
        } else {
            String msg = "Appointment does not exist";
            return msg;
        }
        String msg = "Appointment deleted";
        return msg;
    }



}

