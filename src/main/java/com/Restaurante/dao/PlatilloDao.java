package com.Restaurante.dao;

import com.Restaurante.domain.Platillo;
import org.springframework.data.repository.CrudRepository;

public interface PlatilloDao extends CrudRepository<Platillo, Long> {
    
}
