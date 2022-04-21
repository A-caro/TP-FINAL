package org.adaitw.javacoach_tp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespuestasDTO implements Serializable  {
    private Long idRespuesta;
    private String contenidoRespuestas;
    private int idPregunta;
    private boolean esCorrecta;

}
