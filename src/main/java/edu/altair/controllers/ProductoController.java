package edu.altair.controllers;


import edu.altair.dtos.ProductoResponseDto;
import edu.altair.services.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/catalogo")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }


    @GetMapping
    public ResponseEntity<List<ProductoResponseDto>> obtenerTodos(){
        return ResponseEntity.ok(productoService.obtenerTodos()); // HTTP 200 OK

    };



   @DeleteMapping("/{codigoSku}")
   public ResponseEntity<Void> eliminarPorCodigoSku(@PathVariable String codigoSku) {
       productoService.eliminarPorCodigoSku(codigoSku);

       return ResponseEntity.noContent().build(); // HTTP 204 No content
   }



}
