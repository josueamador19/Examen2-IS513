package hn.unah.examen2.modelos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class TipoVehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtipovehiculo")
    private int idtipovehiculo;

    private String descripcion;
    private double precixhora;
    @JsonIgnore
    @OneToMany(mappedBy = "tipoVehiculo", cascade = CascadeType.ALL)
    private List<Vehiculo> vehiculos;

}
