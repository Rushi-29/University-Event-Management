package com.geekster.UniversityEventManagement.controllers;

import com.geekster.UniversityEventManagement.models.Event;
import com.geekster.UniversityEventManagement.models.Student;
import com.geekster.UniversityEventManagement.repositories.EventRepo;
import com.geekster.UniversityEventManagement.services.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(value = "/Event")
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping(value = "/addEvent")
    public String addEvent(@Valid @RequestBody List<Event> events) {
        return eventService.addEvent(events);
    }
    @GetMapping(value = "/getAll")
    public List<Event> getAllEvents(){
        return eventService.getAllEvent();
    }

    @GetMapping("/date/{date}")
    public List<Event> getEventByDate(@PathVariable String date){
        LocalDate localDate = LocalDate.parse(date);
        return eventService.getEventByDate(localDate);
    }

    @PutMapping(value = "/update")
    public String updateEventByEventId(@RequestBody Event event){
        return eventService.updateEvent(event);
    }

    @DeleteMapping("/{eventId}")
    public String deleteEventByEventId(@PathVariable Integer eventId){
        return eventService.deleteEventByEventId(eventId);
    }
}
