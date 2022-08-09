/**
 * 
 */
package com.db.grad.javaapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.grad.javaapi.model.Trade;
import com.db.grad.javaapi.repository.TradeRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

/**
 * @author Dell
 *
 */
@RestController
@RequestMapping("/api/v1")
public class TradeController {
	
	
	@Autowired
	private TradeRepository tradeRepository;
	
	@GetMapping("/trade")
	public List<Trade> getTrade() {
		
		return tradeRepository.findAll();
	}
	
	@PostMapping("/trade")
	public Trade createTrade(@Valid @RequestBody Trade Trade) {
		
		return tradeRepository.saveAndFlush(Trade);
	}
	
}
