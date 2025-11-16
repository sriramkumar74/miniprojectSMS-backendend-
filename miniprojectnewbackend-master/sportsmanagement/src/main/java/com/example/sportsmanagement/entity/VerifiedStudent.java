
//package com.example.sportsmanagement.entity;
//
//import jakarta.persistence.*;
//import lombok.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "verified_students")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//public class VerifiedStudent {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String rollNo;
//    private String name;
//    private String department;
//    private LocalDateTime verifiedAt = LocalDateTime.now();
//}

package com.example.sportsmanagement.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "verified_student")
@Getter @Setter
public class VerifiedStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String rollNo;
    private String department;
    private String phone;
    private String game;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRollNo() { return rollNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getGame() { return game; }
    public void setGame(String game) { this.game = game; }
}
