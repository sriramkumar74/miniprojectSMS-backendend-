//package com.example.sportsmanagement.service;
//
//import org.springframework.stereotype.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.example.sportsmanagement.repository.StudentRepository;
//import com.example.sportsmanagement.entity.Student;
//import java.util.List;
//
//@Service
//public class StudentService {
//    @Autowired
//    private StudentRepository repo;
//
//    public List<Student> findAll() { return repo.findAll(); }
//    public Student save(Student s) { return repo.save(s); }
//}

package com.example.sportsmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sportsmanagement.entity.Student;
import com.example.sportsmanagement.repository.StudentRepository;
import java.util.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public List<Student> findAll() {
        return repo.findAll();
    }

    public Student save(Student s) {
        return repo.save(s);
    }

    // ✅ New: verify student by roll number or name
    public Optional<Student> verifyStudent(String rollNo, String name) {
        if (rollNo != null && !rollNo.isEmpty()) {
            return repo.findByRollNo(rollNo);
        } else if (name != null && !name.isEmpty()) {
            return repo.findByName(name);
        }
        return Optional.empty();
    }
}
