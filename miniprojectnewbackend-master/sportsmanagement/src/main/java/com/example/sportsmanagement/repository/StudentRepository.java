//package com.example.sportsmanagement.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.sportsmanagement.entity.Student;
//
//public interface StudentRepository extends JpaRepository<Student, Long> {
//}

package com.example.sportsmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sportsmanagement.entity.Student;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByRollNo(String rollNo);
    Optional<Student> findByName(String name);
    Optional<Student> findByDepartment(String department);


}

