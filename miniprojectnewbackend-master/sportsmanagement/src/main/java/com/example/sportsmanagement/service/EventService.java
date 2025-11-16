//package com.example.sportsmanagement.service;

//import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.example.sportsmanagement.repository.EventRepository;
//import com.example.sportsmanagement.entity.Event;
//import java.util.List;
//
//@Service
//public class EventService {
//    @Autowired
//    private EventRepository repo;
//
//    public List<Event> findAll() { return repo.findAll(); }
//    public Event save(Event e) { return repo.save(e); }
//    public void deleteById(Long id) {
//        if (repo.existsById(id)) {
//            repo.deleteById(id);
//        } else {
//            throw new RuntimeException("Event not found with id: " + id);
//        }
//    }
//
//}

package com.example.sportsmanagement.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sportsmanagement.repository.EventRepository;
import com.example.sportsmanagement.entity.Event;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository repo;

    public List<Event> findAll() {
        return repo.findAll();
    }

    public Event save(Event e) {
        return repo.save(e);
    }

    // ✅ Add this delete method
    public void deleteById(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Event not found with id: " + id);
        }
    }
}

