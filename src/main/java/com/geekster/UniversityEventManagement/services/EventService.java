package com.geekster.UniversityEventManagement.services;

import com.geekster.UniversityEventManagement.models.Event;
import com.geekster.UniversityEventManagement.models.Student;
import com.geekster.UniversityEventManagement.repositories.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDate;
@Service
public class EventService {
    @Autowired
    EventRepo eventRepo;
    public String addEvent(List<Event> events) {
        eventRepo.saveAll(events);
        return "Added successfully";
    }

        public List<Event> getEventByDate(LocalDate localDate) {
            return eventRepo.findAllByDate(localDate);
        }

        public String updateEvent(Event event) {
            if(eventRepo.existsById(event.getEventId())){
                eventRepo.save(event);
                return "Updated successfully";
            }
            return "No Event to update. ";
        }

        public String deleteEventByEventId(int eventId) {
            if(eventRepo.existsById(eventId)){
                eventRepo.deleteById(eventId);
                return "Deleted successfully";
            }
            return "No Event to delete.";

        }

        public List<Event> getAllEvent() {
            return (List<Event>) eventRepo.findAll();
        }

    }

