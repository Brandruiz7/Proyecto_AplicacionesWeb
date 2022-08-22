package com.Restaurante.service;

import com.Restaurante.domain.Cliente;
import java.util.List; 

public interface CarritoService {
    public Carrito getCarrito(Carrito carrito);
    public Carrito getCarritoCliente(long idCliente);
}