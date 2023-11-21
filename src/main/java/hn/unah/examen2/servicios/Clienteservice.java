package hn.unah.examen2.servicios;

import java.util.List;

import hn.unah.examen2.modelos.Cliente;

public interface Clienteservice {
    public Cliente crear(Cliente cliente);

    public List<Cliente> obtener();

}
