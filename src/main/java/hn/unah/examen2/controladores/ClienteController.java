package hn.unah.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.modelos.Cliente;
import hn.unah.examen2.servicios.impl.Clienteserviceimpl;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    @Autowired
    private Clienteserviceimpl clienteserviceimpl;

    @PostMapping("/crear")
    public Cliente crear(@RequestBody Cliente cliente) {
        return this.clienteserviceimpl.crear(cliente);
    }
}
