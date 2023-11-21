package hn.unah.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.examen2.modelos.TipoVehiculo;
import hn.unah.examen2.repositorios.TipoVehiculorepository;
import hn.unah.examen2.servicios.TipoVehiculoservice;

public class TipoVehiculoserviceimpl implements TipoVehiculoservice {

    @Autowired
    private TipoVehiculorepository tipoVehiculorepository;

    @Override
    public TipoVehiculo crear(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculorepository.save(tipoVehiculo);
    }

}
