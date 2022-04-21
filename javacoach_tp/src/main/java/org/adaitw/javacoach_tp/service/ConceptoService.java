package org.adaitw.javacoach_tp.service;


import org.adaitw.javacoach_tp.model.dto.ConceptoDTO;
import java.util.List;

public interface ConceptoService {

  List<ConceptoDTO> findAllConceptos();

  String crearConcepto(ConceptoDTO conceptoDTO);


  String actualizarConcepto(ConceptoDTO actualizarConcepto);


  String eliminarConcepto(ConceptoDTO eliminarConcepto);









  //firma endpoint 5
/*  List <PreguntasDTO> mostrarCuestionarioConcepto(Long idConcepto);*/

/* //firma del endpoint 6

  Boolean validarCuestionario(Long id_pregunta, Long id_respuesta);

//firma del endpoint 7
  String enviarConsejo(String mail);*/





}
