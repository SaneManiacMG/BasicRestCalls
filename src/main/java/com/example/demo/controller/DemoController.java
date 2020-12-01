package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @GetMapping
    public String doGet(HttpServletRequest request) {
        return "in request: " + request.getMethod();
    }

    @PostMapping
    public String doPost(HttpServletRequest request) {
        return "in request: " + request.getMethod();
    }

    @PutMapping
    public String doPut(HttpServletRequest request) {
        return "in request: " + request.getMethod();
    }

    @DeleteMapping
    public String doDelete(HttpServletRequest request) {
        return "in request: " + request.getMethod();
    }

    @PatchMapping
    public String doPatch(HttpServletRequest request) {
        return "in request: " + request.getMethod();
    }
}
