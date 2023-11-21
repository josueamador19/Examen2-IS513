package hn.unah.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.modelos.Cliente;
import hn.unah.examen2.modelos.TipoCliente;
import hn.unah.examen2.servicios.impl.TipoClienteserviceimpl;

@RestController
@RequestMapping("/api/TipoCliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteserviceimpl tipoClienteserviceimpl;

    @PostMapping("/crear")
    public TipoCliente crear(@RequestBody TipoCliente tipocliente) {
        return this.tipoClienteserviceimpl.crear(tipocliente);
    }

}
