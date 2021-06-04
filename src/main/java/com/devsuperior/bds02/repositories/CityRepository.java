package com.devsuperior.bds02.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds02.entities.City;

@Transactional				
public interface CityRepository extends JpaRepository<City, Long> {

}
