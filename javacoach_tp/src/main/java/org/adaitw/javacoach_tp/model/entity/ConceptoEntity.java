package org.adaitw.javacoach_tp.model.entity;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name= "Conceptos")
public class ConceptoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConcepto;
    private String nombreConcepto;
    private int numeroConcepto;
    private String contenidoConcepto;

}
