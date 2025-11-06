package com.example.sportsmanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sportsmanagement.entity.Team;
import com.example.sportsmanagement.service.TeamService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/teams")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<Team> list() { return teamService.findAll(); }

    @PostMapping
    public Team create(@RequestBody Team t) { return teamService.save(t); }
}

