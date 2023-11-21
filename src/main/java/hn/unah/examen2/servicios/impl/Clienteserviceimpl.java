package hn.unah.examen2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.modelos.Cliente;
import hn.unah.examen2.repositorios.Clienterepository;
import hn.unah.examen2.servicios.Clienteservice;

@Service
public class Clienteserviceimpl implements Clienteservice {
    @Autowired
    private Clienterepository clienterepository;

    @Override
    public Cliente crear(Cliente cliente) {
        return this.clienterepository.save(cliente);
    }

    @Override
    public List<Cliente> obtener() {
        return this.clienterepository.findAll();
    }

}
