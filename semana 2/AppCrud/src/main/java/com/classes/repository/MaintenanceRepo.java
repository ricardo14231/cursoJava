package com.classes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classes.model.MaintenanceModel;

public interface MaintenanceRepo extends JpaRepository<MaintenanceModel, Long>{

}
