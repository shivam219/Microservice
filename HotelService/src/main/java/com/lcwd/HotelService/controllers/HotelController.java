package com.lcwd.HotelService.controllers;

import com.lcwd.HotelService.entities.Hotel;
import com.lcwd.HotelService.service.impl.HotelServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelServiceImp hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setId(id);
        Hotel user1 = hotelService.saveHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
        Hotel hotel = hotelService.getHotel(hotelId);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel);
    }

    @GetMapping()
    public ResponseEntity<List<Hotel>> getAllHotel() {
        List<Hotel> allHotel = hotelService.getAllHotel();
        return ResponseEntity.status(HttpStatus.CREATED).body(allHotel);
    }
}
