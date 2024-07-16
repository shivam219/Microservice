package com.lcwd.controllers;

import com.lcwd.entities.Rating;
import com.lcwd.service.impl.RatingServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingServiceImp ratingService;
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        String ratingId = UUID.randomUUID().toString();
        rating.setRatingId(ratingId);
        Rating user1 = ratingService.saveUser(rating);
        return ResponseEntity.status(HttpStatus.OK).body(user1);
    }

    @PutMapping("/{ratingId}")
    public ResponseEntity<Rating> updateRating(@PathVariable String ratingId, @RequestBody Rating rating) {
        rating.setRatingId(ratingId);
        Rating rating1 = ratingService.saveUser(rating);
        return ResponseEntity.status(HttpStatus.OK).body(rating1);
    }

    @DeleteMapping("/{ratingId}")
    public ResponseEntity<?> deleteRating(@PathVariable String ratingId) {
        ratingService.deleteRating(ratingId);
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingId);
    }


    @GetMapping("/{ratingId}")
    public ResponseEntity<Rating> getRating(@PathVariable String ratingId) {
        Rating user1 = ratingService.getRating(ratingId);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    @GetMapping()
    public ResponseEntity<List<Rating>> getAllRating() {
        List<Rating> allUser = ratingService.getAllRating();
        return ResponseEntity.status(HttpStatus.CREATED).body(allUser);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId) {
        List<Rating> ratings = ratingService.getRatingByUserId(userId);
        return ResponseEntity.status(HttpStatus.CREATED).body(ratings);
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId) {
        List<Rating> ratings = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.status(HttpStatus.CREATED).body(ratings);
    }

}
