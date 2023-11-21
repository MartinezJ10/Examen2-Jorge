package com.examenjorge.jorge.modelos;

import jakarta.persistence.CascadeType;
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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="vehiculos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculos {
    
    @Id
    @Column(name = "idvehiculo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVehiculo;

    private String marca;

    private int anio; 

    private boolean disponible;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtipovehiculo")
    private TipoVehiculo idTipoVehiculo;
}
