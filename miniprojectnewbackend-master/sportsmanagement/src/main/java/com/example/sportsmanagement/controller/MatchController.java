package com.example.sportsmanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sportsmanagement.entity.Match;
import com.example.sportsmanagement.service.MatchService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping
    public List<Match> list() { return matchService.findAll(); }

    @PostMapping
    public Match create(@RequestBody Match m) { return matchService.save(m); }
}
