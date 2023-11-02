package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/display")

public class Hellocontroller {

@GetMapping("/getmethod")

String print() {

return "getmethod";

}

}


