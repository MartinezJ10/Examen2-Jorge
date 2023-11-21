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
@Table(name="cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    
    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCliente;

    private String nombre;

    private String apellido;

    @Column(name = "fechaingreso")
    private int fechaIngreso;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idtipocliente")
    private TipoCliente idTipoCliente;

}
