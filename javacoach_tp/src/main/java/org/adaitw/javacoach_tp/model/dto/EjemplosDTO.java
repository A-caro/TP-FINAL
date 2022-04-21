package org.adaitw.javacoach_tp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EjemplosDTO implements Serializable {
    private Long idEjemplos;
    private String contenidoEjemplo;
    private String descripcionEjemplo;
    private int idConcepto;
}
