package com.example.sportsmanagement.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sportsmanagement.repository.MatchRepository;
import com.example.sportsmanagement.entity.Match;
import java.util.List;

@Service
public class MatchService {
    @Autowired
    private MatchRepository repo;

    public List<Match> findAll() { return repo.findAll(); }
    public Match save(Match m) { return repo.save(m); }
}
