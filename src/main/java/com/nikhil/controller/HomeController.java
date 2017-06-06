package com.nikhil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
      @RequestMapping("/")
    public String home() {
    	  return "Hi its Nikhil Kumar, Welcome to E-giants Technologies LLC. Am done with Assignment-42";
      }

}
