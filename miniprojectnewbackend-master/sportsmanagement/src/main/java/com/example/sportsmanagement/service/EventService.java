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

    public List<Event> findAll() { return repo.findAll(); }
    public Event save(Event e) { return repo.save(e); }
}
