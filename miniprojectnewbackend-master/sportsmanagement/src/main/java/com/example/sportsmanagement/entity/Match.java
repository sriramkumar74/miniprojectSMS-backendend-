
package com.example.sportsmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "match_table")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // primary key

    private String teamA;
    private String teamB;
    private String matchDate; // ISO datetime string
    private String venue;
}
