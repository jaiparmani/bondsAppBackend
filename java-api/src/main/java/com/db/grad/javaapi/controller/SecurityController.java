package com.db.grad.javaapi.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.exception.ResourceNotFoundException;
import com.db.grad.javaapi.model.Security;
import com.db.grad.javaapi.repository.SecurityRepository;

@RestController
@RequestMapping("/api/v1")
public class SecurityController {
	
	@Autowired
	private SecurityRepository securityRepository;
	
	@GetMapping("/security")
	public List<Security> getSecurity() {	
		return securityRepository.findAll();
	}
	
	@GetMapping("/security/{id}")
    public ResponseEntity < Security > getSecurityById2(@PathVariable(value = "id") int id)
    throws ResourceNotFoundException {
        Security security = securityRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Security not found for this id :: " + id));
        return ResponseEntity.ok().body(security);
    }
	
	@GetMapping("/security/date")
	public List<Security> getSecurityInDateRange(@RequestParam("from") @DateTimeFormat(pattern="yyyy-MM-dd") Date from_date, @RequestParam("to") @DateTimeFormat(pattern="yyyy-MM-dd") Date to_date) {
		return securityRepository.findByMaturityDateBetween(from_date, to_date);
	}
	
}
