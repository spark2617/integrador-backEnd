package br.com.dh.ecommerce.controllers.exceptions;

import br.com.dh.ecommerce.services.Exceptions.DataBaseException;
import br.com.dh.ecommerce.services.Exceptions.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ManipulatorException {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Error> entityNotFound(EntityNotFoundException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.NOT_FOUND;
        Error error = new Error();
        error.setTimestamp(Instant.now());
        error.setStatus(status.value());
        error.setError("Registro Não Encontrado!");
        error.setMsg(e.getMessage());
        error.setLink(request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler(DataBaseException.class)
    public ResponseEntity<Error> integrityViolation(DataBaseException e, HttpServletRequest request){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        Error error = new Error();
        error.setTimestamp(Instant.now());
        error.setStatus(status.value());
        error.setError("Violação de Integridade (Chave Estrangeira)!");
        error.setMsg(e.getMessage());
        error.setLink(request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }

}
