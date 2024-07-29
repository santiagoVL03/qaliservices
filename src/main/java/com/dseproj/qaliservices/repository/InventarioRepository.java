package com.dseproj.qaliservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dseproj.qaliservices.entity.InventarioEntity;

@Repository
public interface InventarioRepository extends JpaRepository<InventarioEntity, Integer> {
    
}
