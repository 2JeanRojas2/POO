package classes;

import exceptions.EstadoErroneoException;

import java.util.List;

public class Cerrado implements EstadoCarrito {

    @Override
    public void agergar(Producto producto, List<Producto> productos) throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede agregar en el estado Cerrado");
    }

    @Override
    public EstadoCarrito cancelar() throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede vaciar un carrito Cerrado");
    }

    @Override
    public EstadoCarrito volver() throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede volver de el estado Cerrado");
    }

    @Override
    public EstadoCarrito avanzar() throws EstadoErroneoException {
        throw new EstadoErroneoException("No se puede avanzar en el estado Cerrado");
    }
}
