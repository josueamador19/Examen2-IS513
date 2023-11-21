package hn.unah.examen2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.modelos.TipoVehiculo;
import hn.unah.examen2.servicios.impl.TipoVehiculoserviceimpl;

@RestController
@RequestMapping("api/TipoVehiculo")
public class TipoVechiculoController {

    @Autowired
    private TipoVehiculoserviceimpl TipoVehiculoserviceimpl;

    @PostMapping("/crear")
    public TipoVehiculo crear(@RequestBody TipoVehiculo tipoVehiculo) {
        return this.TipoVehiculoserviceimpl.crear(tipoVehiculo);
    }
}
