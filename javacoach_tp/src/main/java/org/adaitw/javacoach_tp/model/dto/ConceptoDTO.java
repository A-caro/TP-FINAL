package org.adaitw.javacoach_tp.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ConceptoDTO implements Serializable {
    private Long idConcepto;
    private String nombreConcepto;
    private int numeroConcepto;
    private String contenidoConcepto;





}
