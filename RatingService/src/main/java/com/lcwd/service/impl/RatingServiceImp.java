package com.lcwd.service.impl;


import com.lcwd.entities.Rating;
import com.lcwd.repositories.RatingRepository;
import com.lcwd.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lcwd.exceptions.ResourceNotFoundException;

import java.util.List;

@Service
public class RatingServiceImp implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating saveUser(Rating user) {
        return ratingRepository.save(user);
    }

    @Override
    public void deleteRating(String RatingId) {
        ratingRepository.deleteById(RatingId);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating getRating(String RatingId) {
        return ratingRepository.findById(RatingId).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findAllByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findAllByHotelId(hotelId);
    }
}
