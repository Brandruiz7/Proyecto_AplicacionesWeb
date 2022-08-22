package com.Restaurante.service;

import com.Restaurante.domain.Platillo;
import java.util.List;

public interface PlatilloService { 
                                 
    public List<Platillo> getPlatillos(); 
    
    public Platillo getPlatillo(Platillo platillo); 
    
    public void save(Platillo platillo); 
    
    public void delete(Platillo platillo);
    
}
