package org.adaitw.javacoach_tp.model.entity;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "preguntas" )
public class PreguntasEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPregunta;
    private String contenidoPregunta;
    private Long idConcepto;

}
