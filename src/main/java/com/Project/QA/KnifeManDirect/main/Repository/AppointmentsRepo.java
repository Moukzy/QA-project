package com.Project.QA.KnifeManDirect.main.Repository;

import com.Project.QA.KnifeManDirect.main.data.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Date;

public interface AppointmentsRepo extends JpaRepository<Appointments,Integer> {

    ArrayList<Appointments> findAll();
    ArrayList<Appointments> findByOrderByIdAsc();
    ArrayList<Appointments> findByAppDate(String appDate);

    Appointments findByAppDateAndTimeSlot(String appDate, String time_slot);





}
