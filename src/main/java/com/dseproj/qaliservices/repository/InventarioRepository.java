package com.dseproj.qaliservices.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dseproj.qaliservices.entity.InventarioEntity;
@Repository
public interface InventarioRepository extends CrudRepository<InventarioEntity, Integer> {
    
}
