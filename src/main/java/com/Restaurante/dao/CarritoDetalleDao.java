package com.Restaurante.dao;


import com.Restaurante.domain.Usuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CarritoDetalleDao extends CrudRepository<CarritoDetalle, Long> {
    public Optional<CarritoDetalle> findByIdCarritoAndArticulo(Long idCarrito, Articulo articulo);
    public List<CarritoDetalle> findByIdCarrito(Long idCarrito);
    public void deleteByIdCarrito(Long idCarrito);
}