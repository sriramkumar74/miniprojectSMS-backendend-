package com.example.sportsmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportsmanagement.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {
}

