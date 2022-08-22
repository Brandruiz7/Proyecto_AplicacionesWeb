package com.Restaurante.service;

import com.Restaurante.dao.PlatilloDao;
import com.Restaurante.domain.Platillo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlatilloServiceImpl implements PlatilloService {
    
    @Autowired
    private PlatilloDao platilloDao;

    @Override
    @Transactional(readOnly = true) 
    public List<Platillo> getPlatillos() { 
        var lista=(List<Platillo>)platilloDao.findAll(); 

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Platillo getPlatillo(Platillo platillo) {
        return platilloDao.findById(platillo.getIdPlatillo()).orElse(null); 
    }                                                                    

    @Override
    @Transactional
    public void save(Platillo platillo) {
        platilloDao.save(platillo);
    }

    @Override
    @Transactional
    public void delete(Platillo platillo) {
        platilloDao.delete(platillo);
    
    }  

}
