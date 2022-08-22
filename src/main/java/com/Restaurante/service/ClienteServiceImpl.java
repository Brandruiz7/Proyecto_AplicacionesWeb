/*
 * Universidad Fidélitas
 * Desarrollo de Aplicaciones Web y Patrones
 * Primer Cuatrimestre 2022
 * Realizado por: Brandon Ruiz Miranda
 * Ejercicios de repaso
 */
package com.Restaurante.service;

import com.Restaurante.dao.ClienteDao;
import com.Restaurante.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Brandon R
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;

    //Los que son de lectura @Transactional(readOnly = true) y sino normal.
    
    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    /**
     * Buscamos un registro de un cliente y si no encuentra devuelve null.
     *
     * @param cliente Dato del cliente en la base de datos.
     * @return
     */
    @Override
    @Transactional(readOnly = true)
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }

    /**
     * Para guardar o sobreescribir
     *
     * @param cliente
     */
    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    /**
     * Para borrar datos.
     *
     * @param cliente
     */
    @Override
    @Transactional
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }
}
