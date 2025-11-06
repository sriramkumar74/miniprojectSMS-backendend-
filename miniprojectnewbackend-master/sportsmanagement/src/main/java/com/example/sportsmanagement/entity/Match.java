
package com.example.sportsmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "match_table")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long eventId;
    private Long teamA;
    private Long teamB;
    private String matchDate; // ISO datetime string
    private Integer scoreA;
    private Integer scoreB;
    private String status;
}

