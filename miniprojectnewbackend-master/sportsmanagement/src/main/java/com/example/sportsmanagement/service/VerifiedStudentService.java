package com.example.sportsmanagement.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.example.sportsmanagement.entity.VerifiedStudent;
import com.example.sportsmanagement.repository.VerifiedStudentRepository;

@Service
public class VerifiedStudentService {

    @Autowired
    private VerifiedStudentRepository repo;

    public VerifiedStudent save(VerifiedStudent s) {
        return repo.save(s);
    }

    public List<VerifiedStudent> findAll() {
        return repo.findAll();
    }
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

}
