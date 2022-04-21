package org.adaitw.javacoach_tp.controller;

import org.adaitw.javacoach_tp.model.dto.ConceptoDTO;


import org.adaitw.javacoach_tp.model.dto.ResponseExcepciones;
import org.adaitw.javacoach_tp.service.impl.ConceptoServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ConceptoController {
    ResponseExcepciones response;

    private static final Logger loggerController =
            LoggerFactory.getLogger(ConceptoController.class);
    @Autowired
    ConceptoServiceImpl conceptoService;


    @RequestMapping(value = "/lista/conceptos", method = RequestMethod.GET, produces = "application/json")
    public List<ConceptoDTO> getConcepto() {
        loggerController.info("Se mostrará una lista de conceptos");
        return conceptoService.findAllConceptos();
    }

    @PostMapping("/crear/conceptos")
    public String crearConcepto(@RequestBody ConceptoDTO conceptoDTO) {
        loggerController.info("Se creará un concepto");
        return conceptoService.crearConcepto(conceptoDTO);
    }


    @DeleteMapping("/eliminar/concepto")
    public String eliminarConcepto(@RequestBody ConceptoDTO eliminarConcepto) {
        loggerController.warn("Se eliminará un concepto");
        return conceptoService.eliminarConcepto(eliminarConcepto);
    }


    @PutMapping("/actualizar/concepto")
    public String actualizarConcepto(@RequestBody ConceptoDTO conceptoActual) {
        loggerController.info("Se actualizará un concepto");
        return conceptoService.actualizarConcepto(conceptoActual);
    }


    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseEntity<ResponseExcepciones> indexOutOfBoundsException(IndexOutOfBoundsException e) {
        loggerController.error("Se detectó un error");
        response = new ResponseExcepciones(
                "[ConceptoController] - IndexOutOfBoundsException: Not Found " + e.getMessage(), 404, "Error");
        return new ResponseEntity<>(response, HttpStatus.IM_USED);
    }
}

