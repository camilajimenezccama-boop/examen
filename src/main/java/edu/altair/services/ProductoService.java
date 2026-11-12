package edu.altair.services;

import edu.altair.dtos.ProductoRequestDto;
import edu.altair.dtos.ProductoResponseDto;

import java.util.List;

public interface ProductoService {

    List<ProductoResponseDto> obtenerTodos();
    ProductoResponseDto crear(ProductoRequestDto productoRequestDto);
    ProductoResponseDto actualizarPorCodigoSku(ProductoRequestDto productoRequestDto, String codigoSku);
    void eliminarPorCodigoSku(String codigoSku);



}
