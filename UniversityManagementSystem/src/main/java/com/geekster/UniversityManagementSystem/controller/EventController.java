package com.geekster.UniversityManagementSystem.controller;

import com.geekster.UniversityManagementSystem.model.Event;
import com.geekster.UniversityManagementSystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/events")
    public String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }
    @PutMapping("/events")
    public String updateEvent(@RequestBody Event event){
        return eventService.updateEvent(event);
    }
    @DeleteMapping("/events/{id}")
    public String deleteById(@PathVariable Long id){
        return eventService.deleteById(id);
    }
    @GetMapping("/events/{date}")
    public Iterable<Event> getEventsByDate(@PathVariable LocalDate enteredDate){
        return eventService.getEventsByDate(enteredDate);
    }

}
