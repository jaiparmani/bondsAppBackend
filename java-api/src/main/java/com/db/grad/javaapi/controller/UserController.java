package com.db.grad.javaapi.controller;

//import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.*;
import com.db.grad.javaapi.repository.TradeRepository;
import com.db.grad.javaapi.repository.*;

//package com.spring.restclient;

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