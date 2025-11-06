package com.example.sportsmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportsmanagement.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
