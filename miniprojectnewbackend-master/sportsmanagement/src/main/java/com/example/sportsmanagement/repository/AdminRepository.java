//package com.example.sportsmanagement.repository;
//
//import com.example.sportsmanagement.entity.Admin;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface AdminRepository extends JpaRepository<Admin, Long> {
//    Admin findByUsernameAndPassword(String username, String password);
//}


package com.example.sportsmanagement.repository;

import com.example.sportsmanagement.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    List<Admin> findByUsernameAndPassword(String username, String password);
}



