package com.wipro.apple.poc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.apple.poc.api.service.CalculatorMSService;

@RestController
@RequestMapping("/api/calculate")
public class CalculatorMSController {

	@Autowired
	private CalculatorMSService calculatorService;

	@GetMapping("/sum")
	public ResponseEntity<Integer> sum(@RequestParam(name = "ip1") int ip1, @RequestParam(name = "ip2") int ip2) {
		Integer result = calculatorService.sum(ip1, ip2);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/product")
	public ResponseEntity<Integer> product(@RequestParam(name = "ip1") int ip1, @RequestParam(name = "ip2") int ip2) {
		Integer result = calculatorService.product(ip1, ip2);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@GetMapping("/modulo")
	public ResponseEntity<Integer> modulo(@RequestParam(name = "ip1") int ip1, @RequestParam(name = "ip2") int ip2) {
		Integer result = calculatorService.modulo(ip1, ip2);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
