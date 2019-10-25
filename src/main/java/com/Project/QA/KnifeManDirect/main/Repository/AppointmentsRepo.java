package com.Project.QA.KnifeManDirect.main.Repository;

import com.Project.QA.KnifeManDirect.main.data.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.Date;

public interface AppointmentsRepo extends JpaRepository<Appointments,Integer> {

    ArrayList<Appointments> findAll();

    Appointments findById(int id);

    ArrayList<Appointments> findByAppDate(Date appDate);

    Appointments findByAppDateAndTimeSlot(Date appDate, int time_slot);





}
