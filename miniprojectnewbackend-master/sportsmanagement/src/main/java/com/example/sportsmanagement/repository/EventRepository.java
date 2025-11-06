package com.example.sportsmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportsmanagement.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
