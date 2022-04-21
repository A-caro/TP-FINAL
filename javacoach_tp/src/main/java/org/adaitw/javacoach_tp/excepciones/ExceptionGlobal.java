package org.adaitw.javacoach_tp.excepciones;



import org.adaitw.javacoach_tp.model.dto.ResponseExcepciones;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionGlobal{

 private ResponseExcepciones responseExcepciones;

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ResponseExcepciones> runtimeException(RuntimeException e) {
        responseExcepciones = new ResponseExcepciones( "[Exception Response] - Exception: "
                + e.getMessage(), 500, "Error");
        return new ResponseEntity<>(responseExcepciones, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseExcepciones> exception(Exception e) {
        responseExcepciones = new ResponseExcepciones("[Exception Response] - Exception: "
                + e.getMessage(), 500, "Error");
        return new ResponseEntity<>(responseExcepciones, HttpStatus.INTERNAL_SERVER_ERROR);
    }



}