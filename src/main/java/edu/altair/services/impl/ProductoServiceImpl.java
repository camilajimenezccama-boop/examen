package edu.altair.services.impl;


import edu.altair.dtos.ProductoRequestDto;
import edu.altair.dtos.ProductoResponseDto;
import edu.altair.entities.Producto;
import edu.altair.exceptions.ProductoNotFoundException;
import edu.altair.repositories.ProductoRepository;
import edu.altair.services.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {


    //inyección de dependencias
    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }


    @Override
    public List<ProductoResponseDto> obtenerTodos() {
        return productoRepository.findAll()
                .stream()
                .map(this::mapToResponseDto)
                .toList();
    }

    @Override
    public ProductoResponseDto crear(ProductoRequestDto productoRequestDto) {
        return null;
    }

    @Override
    public ProductoResponseDto actualizarPorCodigoSku(ProductoRequestDto productoRequestDto, String codigoSku) {
        return null;
    }

    @Override
    public void eliminarPorCodigoSku(String codigoSku) {
        if (!productoRepository.existsByCodigoSku(codigoSku)) {
            throw  new ProductoNotFoundException("El producto con el ID ingresado no existe");
        }

        productoRepository.deleteByCodigoSku(codigoSku);

    }



    private ProductoResponseDto mapToResponseDto(Producto producto){
        return new ProductoResponseDto(
                producto.getIdProduct(),
                producto.codigoSku,
                producto.getNombre(),
                producto.getDescripcion(),
                producto.getPrecio(),
                producto.getStock(),
                producto.getFechaAlta()
        );
    }
}
