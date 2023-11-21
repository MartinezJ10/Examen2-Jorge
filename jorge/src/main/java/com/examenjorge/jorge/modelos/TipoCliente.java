package com.examenjorge.jorge.modelos;

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
@Table(name="tipocliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoCliente {
    
    @Id
    @Column(name = "idtipocliente")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idTipoCliente;

    private String descripcion;

}
