package com.a00463084.Assignment.config;

import com.a00463084.Assignment.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository <Hotel,Integer> {
}
