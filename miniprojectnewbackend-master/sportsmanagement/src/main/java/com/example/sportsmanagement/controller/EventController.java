package com.example.sportsmanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sportsmanagement.entity.Event;
import com.example.sportsmanagement.service.EventService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> list() { return eventService.findAll(); }

    @PostMapping
    public Event create(@RequestBody Event e) { return eventService.save(e); }
}
