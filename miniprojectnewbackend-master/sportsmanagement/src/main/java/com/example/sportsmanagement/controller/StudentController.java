


package com.example.sportsmanagement.controller;

import com.example.sportsmanagement.service.VerifiedStudentService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.sportsmanagement.entity.Student;
import com.example.sportsmanagement.entity.VerifiedStudent;
import com.example.sportsmanagement.service.StudentService;
import java.util.*;

//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/api/students")
//public class StudentController {
//
//    @Autowired
//    private StudentService studentService;
//
//
//    @GetMapping
//    public List<Student> list() {
//        return studentService.findAll();
//    }
//
//    @PostMapping
//    public Student create(@RequestBody Student s) {
//        return studentService.save(s);
//    }
//    @Autowired
//    private VerifiedStudentService verifiedService;
//
//    // ✅ Verify and Save
//    @PostMapping("/verify")
//    public Map<String, Object> verifyStudent(@RequestBody Map<String, String> data) {
//        String rollNo = data.get("rollNo");
//        String name = data.get("name");
//        String department = data.get("department");
//
//
//        Optional<Student> student = studentService.verifyStudent(rollNo,name);
//        Map<String, Object> response = new HashMap<>();
//
//
//        if (student.isPresent()) {
//            VerifiedStudent vs = studentService.saveVerifiedStudent(student.get(), department);
//            response.put("status", "success");
//            response.put("student", vs);
//        } else {
//            response.put("status", "error");
//            response.put("message", "Invalid student credentials");
//        }
//
//        return response;
//    }
//
//
//
//
//    // ✅ Get all verified students
//    @GetMapping("/verified")
//    public List<VerifiedStudent> getAllVerifiedStudents() {
////        return studentService.getAllVerifiedStudents();
//        return verifiedService.findAll();
//    }
//
//    // ✅ Delete verified student (admin only frontend)
//    @DeleteMapping("/verified/{id}")
//    public String deleteVerified(@PathVariable Long id) {
//        studentService.deleteVerifiedById(id);
//        return "Deleted successfully";
//    }
//}

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

    // Verify Student
    @PostMapping("/verify")
    public Map<String, Object> verifyStudent(@RequestBody Map<String, String> data) {

        String rollNo = data.get("rollNo");
        String name = data.get("name");
        String department = data.get("department");
        String game = data.get("game");

        Optional<Student> student = studentService.verifyStudent(rollNo, name);
        Map<String, Object> response = new HashMap<>();

        if (student.isPresent()) {

            VerifiedStudent vs = studentService.saveVerifiedStudent(student.get(), department,game);

            response.put("status", "success");
            response.put("student", vs);

        } else {
            response.put("status", "error");
            response.put("message", "Invalid student credentials");
        }

        return response;
    }

    // Get all verified students
    @GetMapping("/verified")
    public List<VerifiedStudent> getAllVerifiedStudents() {
        return studentService.getAllVerifiedStudents();
    }

    // Delete verified
    @DeleteMapping("/verified/{id}")
    public String deleteVerified(@PathVariable Long id) {
        studentService.deleteVerifiedById(id);
        return "Deleted successfully";
    }
}


