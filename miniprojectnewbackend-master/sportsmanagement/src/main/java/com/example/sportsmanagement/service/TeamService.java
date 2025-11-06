package com.example.sportsmanagement.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sportsmanagement.repository.TeamRepository;
import com.example.sportsmanagement.entity.Team;
import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository repo;

    public List<Team> findAll() { return repo.findAll(); }
    public Team save(Team t) { return repo.save(t); }
}
