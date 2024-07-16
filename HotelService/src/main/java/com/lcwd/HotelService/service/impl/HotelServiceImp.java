package com.lcwd.HotelService.service.impl;

import com.lcwd.HotelService.entities.Hotel;
import com.lcwd.HotelService.repositories.HotelRepository;
import com.lcwd.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lcwd.HotelService.exceptions.ResourceNotFoundException;

import java.util.List;

@Service
public class HotelServiceImp implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        System.out.println(id);
        return hotelRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }
}
