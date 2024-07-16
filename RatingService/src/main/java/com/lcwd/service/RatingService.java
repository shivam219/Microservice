package com.lcwd.service;

import com.lcwd.entities.Rating;

import java.util.List;

public interface RatingService {
    Rating saveUser(Rating Rating);

    void deleteRating(String RatingId);

    List<Rating> getAllRating();

    Rating getRating(String RatingId);

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);

}
