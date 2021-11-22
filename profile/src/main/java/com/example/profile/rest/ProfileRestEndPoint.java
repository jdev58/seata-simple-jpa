package com.example.profile.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.profile.service.UserService;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019/3/28
 */
@RestController
@RequestMapping("/profile")
public class ProfileRestEndPoint {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/register")
    public ResponseEntity<String> register() {
    	
    	userService.doRegister();
    	return new ResponseEntity<String>("true",HttpStatus.OK);
    }
}
