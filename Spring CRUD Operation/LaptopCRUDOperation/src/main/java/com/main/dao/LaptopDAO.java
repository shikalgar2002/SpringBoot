package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.LaptopEntity;

@Repository
public interface LaptopDAO extends JpaRepository<LaptopEntity, Integer>{

}
