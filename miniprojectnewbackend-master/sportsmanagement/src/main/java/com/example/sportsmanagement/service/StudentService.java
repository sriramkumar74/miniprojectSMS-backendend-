

//package com.example.sportsmanagement.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.example.sportsmanagement.entity.Student;
//import com.example.sportsmanagement.repository.StudentRepository;
//import java.util.*;
//
//@Service
//public class StudentService {
//    @Autowired
//    private StudentRepository repo;
//
//    public List<Student> findAll() {
//        return repo.findAll();
//    }
//
//    public Student save(Student s) {
//        return repo.save(s);
//    }
//
//
//
//    // ✅ New: verify student by roll number or name
//    public Optional<Student> verifyStudent(String rollNo, String name) {
//        if (rollNo != null && !rollNo.isEmpty()) {
//            return repo.findByRollNo(rollNo);
//        } else if (name != null && !name.isEmpty()) {
//            return repo.findByName(name);
//        }
//        return Optional.empty();
//    }
//}

package com.example.sportsmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sportsmanagement.entity.Student;
import com.example.sportsmanagement.entity.VerifiedStudent;
import com.example.sportsmanagement.repository.StudentRepository;
import com.example.sportsmanagement.repository.VerifiedStudentRepository;
import java.util.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    @Autowired
    private VerifiedStudentRepository verifiedRepo;

    public List<Student> findAll() {
        return repo.findAll();
    }

    public Student save(Student s) {
        return repo.save(s);
    }

    // ✅ verify by rollNo or name
//    public Optional<Student> verifyStudent(String name, String rollNo) {
//        if (rollNo != null && !rollNo.isEmpty()) {
//            return repo.findByRollNo(rollNo);
//        } else if (name != null && !name.isEmpty()) {
//            return repo.findByName(name);
//        }
//        return Optional.empty();
//    }
    // VERIFY student by rollNo or name
    public Optional<Student> verifyStudent(String rollNo, String name) {

        if (rollNo != null && !rollNo.isEmpty()) {
            return repo.findByRollNo(rollNo);
        }

        if (name != null && !name.isEmpty()) {
            return repo.findByName(name);
        }

        return Optional.empty();
    }



    // ✅ Save verified student
    public VerifiedStudent saveVerifiedStudent(Student s, String department,String game) {
        VerifiedStudent vs = new VerifiedStudent();
        vs.setName(s.getName());
        vs.setRollNo(s.getRollNo());
        vs.setDepartment(department != null ? department : s.getDepartment());
        vs.setPhone(s.getPhone());
        vs.setGame(game);
        return verifiedRepo.save(vs);
    }

    public List<VerifiedStudent> getAllVerifiedStudents() {
        return verifiedRepo.findAll();
    }

    public void deleteVerifiedById(Long id) {
        verifiedRepo.deleteById(id);
    }
}

