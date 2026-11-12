package edu.altair.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.net.URI;
import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CodigoSkuAlreadyExistsException.class)
    public ProblemDetail manejarCodigoSkuAlreadyExistsException(CodigoSkuAlreadyExistsException ex){
        ProblemDetail problem = ProblemDetail.forStatusAndDetail(HttpStatus.CONFLICT, ex.getMessage());

        problem.setTitle("El código sku ya existe");
        problem.setProperty("timestap", Instant.now());

        return problem;

    }

    @ExceptionHandler(ProductoNotFoundException.class)
    public ProblemDetail manejarProductoNotFoundException(ProductoNotFoundException ex) {
        ProblemDetail problem = ProblemDetail.forStatusAndDetail(
                HttpStatus.NOT_FOUND,
                ex.getMessage()
        );
        problem.setTitle("Producto no encontrado");
        problem.setProperty("timestamp", Instant.now());
        return problem;
    }
}
