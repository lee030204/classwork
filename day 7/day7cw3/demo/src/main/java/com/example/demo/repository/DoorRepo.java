package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Door;

@Repository
public interface DoorRepo extends JpaRepository <Door,Integer> 
{
    List<Door> findByAccessType(String accessType);
    
}
