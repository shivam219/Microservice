package com.lcwd.HotelService.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/staffs")
@RestController
public class StaffController {
    @GetMapping
    public ResponseEntity<List<?>> getStaff() {
        return ResponseEntity.status(HttpStatus.CREATED).body(List.of("Shiva","Deepak")  );
    }
}

