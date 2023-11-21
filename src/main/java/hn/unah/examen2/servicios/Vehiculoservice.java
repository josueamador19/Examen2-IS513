package hn.unah.examen2.servicios;

import java.util.List;

import hn.unah.examen2.modelos.Vehiculo;

public interface Vehiculoservice {
    public Vehiculo crear(Vehiculo vehiculo);

    public List<Vehiculo> obtener();
}
