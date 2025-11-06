package com.example.sportsmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "event")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(length = 1000)
    private String description;
    private String eventDate; // ISO date string (YYYY-MM-DD)
    private String venue;
}
