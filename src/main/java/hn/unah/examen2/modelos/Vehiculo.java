package hn.unah.examen2.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvehiculo")
    private int idvehiculo;

    private String marca;
    private int anio;
    private boolean disponible;

    @JsonIgnore
    @ManyToOne

    @JoinColumn(name = "idtipovehiculo")
    private TipoVehiculo tipoVehiculo;

}
