//package com.example.sportsmanagement.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import com.example.sportsmanagement.service.AdminService;
//import java.util.*;
//
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//@RequestMapping("/api/admin")
//public class AdminController {
//
//    @Autowired
//    private AdminService adminService;
//
//    @PostMapping("/login")
//    public Map<String, Object> login(@RequestBody Map<String, String> request) {
//        String username = request.get("username");
//        String password = request.get("password");
//
//        boolean valid = adminService.validateAdmin(username, password);
//
//        Map<String, Object> response = new HashMap<>();
//        if (valid) {
//            response.put("status", "success");
//            response.put("message", "Login successful");
//        } else {
//            response.put("status", "failed");
//            response.put("message", "Invalid username or password");
//        }
//        return response;
//    }
//}

package com.example.sportsmanagement.controller;

import com.example.sportsmanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("username");
        String password = loginData.get("password");

        Map<String, String> response = new HashMap<>();
        if (adminService.validateAdmin(username, password)) {
            response.put("status", "success");
        } else {
            response.put("status", "fail");
        }
        return response;
    }
}

