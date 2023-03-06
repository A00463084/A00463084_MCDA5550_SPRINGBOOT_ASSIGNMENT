package com.a00463084.Assignment.controller;

import com.a00463084.Assignment.config.HotelRepository;
import com.a00463084.Assignment.entity.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @Autowired
    HotelRepository hotelRepository;

    @PostMapping("/addHotel")
    public String addHotel(@RequestBody Hotel hotel){

        hotelRepository.save(hotel);

        return "Added Hotel";

    }

    @GetMapping("/getdetails")
    public List<Hotel> getdetail(){

        return hotelRepository.findAll();
    }
}
