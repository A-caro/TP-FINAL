package org.adaitw.javacoach_tp.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PreguntasDTO implements Serializable {
    private Long idPregunta;
    private String contenidoPregunta;
    private int idConcepto;


}
