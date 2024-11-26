package com.example.demo.controller;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class UserController {
	   @GetMapping("/api/v1/user")
	    public Map<String, String> getUserNo(HttpServletRequest request) {

	        String userNo = "82022978";

	        Map<String, String> response = new HashMap<>();
	        response.put("userNo", userNo);
	        return response;
	    }
}
