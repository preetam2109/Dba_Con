package controller;

import Service.LoginService;
import User.User;
import jpa.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private LoginService userService;

    @GetMapping("/usrusers/{userId}")
    public ResponseEntity<List<Object[]>> getUserDetails(@PathVariable Long userId) {
        List<Object[]> userDetails = userService.getUserDetailsById(userId);
        if (userDetails != null && !userDetails.isEmpty()) {
            return ResponseEntity.ok(userDetails);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
