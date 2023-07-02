package com.geekster.UniversityManagementSystem.service;

import com.geekster.UniversityManagementSystem.model.Event;
import com.geekster.UniversityManagementSystem.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EventService {
    @Autowired
    private IEventRepo eventRepo;

    public String addEvent(Event event) {
        eventRepo.save(event);
        return "Event added successfully";
    }

    public String updateEvent(Event event) {
        eventRepo.save(event);
        return "Event updated successfully";
    }

    public String deleteById(Long id) {
        eventRepo.deleteById(id);
        return "events deleted successfully";
    }

    public Iterable<Event> getEventsByDate(LocalDate enteredDate) {
        return eventRepo.findByDate(enteredDate);
    }
}
