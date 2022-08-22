 @Servicepublic class CarritoDetalleServiceImpl implements CarritoDetalleService {
    @Autowired    CarritoDetalleDao carritoDetalleDao;
    @Override    public CarritoDetalle getCarritoDetalle(Long idCarrito, Articulo articulo) {
        return carritoDetalleDao.findByIdCarritoAndArticulo(idCarrito, articulo).orElse(null);
    }
    @Override    public List<CarritoDetalle> getCarritoDetalles(Long idCarrito) {
        return (List<CarritoDetalle>)carritoDetalleDao.findByIdCarrito(idCarrito);
    }
    @Override    public void save(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.save(carritoDetalle);
    }
    @Override    public void delete(CarritoDetalle carritoDetalle) {
        carritoDetalleDao.delete(carritoDetalle);
    }
    @Override    public void deleteAll(Long idCarrito) {
        carritoDetalleDao.deleteByIdCarrito(idCarrito);
    }     
}