package hn.unah.examen2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.TipoCliente;
import hn.unah.examen2.repositorios.TipoClienterepository;
import hn.unah.examen2.servicios.TipoClienteservice;

@Service
public class TipoClienteserviceimpl implements TipoClienteservice {
    @Autowired
    private TipoClienterepository tipoClienterepository;

    @Override
    public TipoCliente crear(TipoCliente tipoCliente) {
        return this.tipoClienterepository.save(tipoCliente);
    }

}
