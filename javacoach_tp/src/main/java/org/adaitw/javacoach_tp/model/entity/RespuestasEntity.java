package org.adaitw.javacoach_tp.model.entity;


import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "respuestas" )
public class RespuestasEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRespuesta;
    private String contenidoRespuestas;
    private Long idPregunta;
    private boolean esCorrecta;

}
