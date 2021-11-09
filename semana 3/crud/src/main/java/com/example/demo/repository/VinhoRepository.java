package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.VinhoModel;

@Repository
public interface VinhoRepository extends JpaRepository<VinhoModel, Long> {

}
