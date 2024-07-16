package com.lcwd.HotelService.service;

import com.lcwd.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService  {
    Hotel saveHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel getHotel(String id);
}
