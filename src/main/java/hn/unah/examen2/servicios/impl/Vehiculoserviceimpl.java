package hn.unah.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.Vehiculo;
import hn.unah.examen2.repositorios.Vehiculorepository;
import hn.unah.examen2.servicios.Vehiculoservice;

@Service
public class Vehiculoserviceimpl implements Vehiculoservice {

    @Autowired
    private Vehiculorepository vehiculorepository;

    @Override
    public Vehiculo crear(Vehiculo vehiculo) {
        return this.vehiculorepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtener() {
        return this.vehiculorepository.findAll();
    }

}
