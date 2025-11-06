//package com.example.sportsmanagement.controller;
//
//import org.springframework.web.bind.annotation.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.example.sportsmanagement.entity.Student;
//import com.example.sportsmanagement.service.StudentService;
//import java.util.List;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/api/students")
//public class StudentController {
//
//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping
//    public List<Student> list() { return studentService.findAll(); }
//
//    @PostMapping
//    public Student create(@RequestBody Student s) { return studentService.save(s); }
//}


package com.example.sportsmanagement.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sportsmanagement.entity.Student;
import com.example.sportsmanagement.service.StudentService;
import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> list() {
        return studentService.findAll();
    }

    @PostMapping
    public Student create(@RequestBody Student s) {
        return studentService.save(s);
    }

    // ✅ New: Verify student by rollNo or name
    @PostMapping("/verify")
    public Map<String, Object> verifyStudent(@RequestBody Map<String, String> data) {
        String rollNo = data.get("rollNo");
        String name = data.get("name");

        Optional<Student> student = studentService.verifyStudent(rollNo, name);

        Map<String, Object> response = new HashMap<>();
        if (student.isPresent()) {
            response.put("status", "success");
            response.put("student", student.get());
        } else {
            response.put("status", "error");
            response.put("message", "Invalid student credentials");
        }
        return response;
    }
}


