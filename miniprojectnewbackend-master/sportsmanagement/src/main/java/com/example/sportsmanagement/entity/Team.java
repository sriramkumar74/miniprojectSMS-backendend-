//package com.example.sportsmanagement.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Table(name = "team")
//@Getter @Setter @NoArgsConstructor @AllArgsConstructor
//public class Team {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private Long eventId; // simple FK by id; can be mapped as relation if needed
//}

package com.example.sportsmanagement.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "team")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamName;
    private String members;
    private String event;
}

