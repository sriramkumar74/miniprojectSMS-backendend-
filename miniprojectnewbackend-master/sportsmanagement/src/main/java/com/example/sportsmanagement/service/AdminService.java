//package com.example.sportsmanagement.service;
//
//import com.example.sportsmanagement.entity.Admin;
//import com.example.sportsmanagement.repository.AdminRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AdminService {
//
//    @Autowired
//    private AdminRepository adminRepository;
//
//    public boolean validateAdmin(String username, String password) {
//        Admin admin = adminRepository.findByUsernameAndPassword(username, password);
//        return admin != null;
//    }
//}

package com.example.sportsmanagement.service;

import com.example.sportsmanagement.entity.Admin;
import com.example.sportsmanagement.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public boolean validateAdmin(String username, String password) {
        List<Admin> admins = adminRepository.findByUsernameAndPassword(username, password);
        return !admins.isEmpty(); // at least one match => true
    }
}








