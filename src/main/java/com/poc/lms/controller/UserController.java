package com.poc.lms.controller;

import com.poc.lms.model.User;
import com.poc.lms.service.UserService;
import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/users")
public class UserController {

    private UserService  userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<User> saveUser(@RequestBody User user)
    {
        return new ResponseEntity<User>(userService.saveUser(user), HttpStatus.CREATED);
    }

}
