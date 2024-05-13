package com.example.demo.repository;

import com.example.demo.entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroundRepository extends JpaRepository<Ground, Integer> {
}
