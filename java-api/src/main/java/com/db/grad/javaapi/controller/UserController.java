package com.db.grad.javaapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.model.User;
import com.db.grad.javaapi.repository.UserRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("/user")
    public List <User > getAllUserd() {
        return userRepository.findAll();
    }


    @PostMapping("/login")
    public String createUserd(@Valid @RequestBody User user) {

    	if(userRepository.existsById(user.getUserid())) {
    		int em=user.getUserid();
    		User temp = userRepository.getById(em);
    		if(temp.getPassword().equals(user.getPassword()))
    		return "Success";
    		else
    			return  "Wrong Pass";
    	}else
    		return "SWR";
    }
    
    }   
