package com.examenjorge.jorge.modelos;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Table(name="reserva")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    
    @Id
    @Column(name = "idreserva")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idReserva;
    
    @Column(name = "idcliente")
    private int idCliente;
    
    @Column(name = "idvehiculo")
    private int idVehiculo;

    private Date fecha;

    private int dias;

    private double total;

}
