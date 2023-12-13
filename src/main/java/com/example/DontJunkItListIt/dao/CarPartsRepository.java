package com.example.DontJunkItListIt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DontJunkItListIt.entity.CarParts;

public interface CarPartsRepository extends JpaRepository<CarParts, Long> {


}
