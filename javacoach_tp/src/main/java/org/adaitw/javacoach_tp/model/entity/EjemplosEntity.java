package org.adaitw.javacoach_tp.model.entity;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "ejemplos" )
public class EjemplosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEjemplos;
    private String contenidoEjemplo;
    private String descripcionEjemplo;
    private int idConcepto;



}
