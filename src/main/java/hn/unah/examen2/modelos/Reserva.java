package hn.unah.examen2.modelos;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva")
    private int idreserva;

    @Column(name = "idcliente")
    private int idcliente;
    @Column(name = "idvehiculo")
    private int idvehiculo;

    private Date fecha;
    private int dias;
    private double total;

}
