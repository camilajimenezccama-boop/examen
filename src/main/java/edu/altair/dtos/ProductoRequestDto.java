package edu.altair.dtos;

import java.time.LocalDate;

public record ProductoRequestDto (


    String codigoSku,
    String nombre,
    String descripcion,
    Integer precio,
    Integer stock,
    LocalDate fechaAlta
){}
