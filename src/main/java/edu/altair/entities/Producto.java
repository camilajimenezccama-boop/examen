package edu.altair.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="productos")
public class Producto {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    public Long idProduct;


    @Column(name= "codigo_sku", unique = true,nullable = false, length = 10)
    public String codigoSku;

    @Column(name="nombre", nullable = false, length = 100)
    public String nombre;


    @Column(name="descripcion",  length = 255)
    public String descripcion;


    @Column(name="precio", nullable = false)
    public Integer precio;

    @Column(name="stock", nullable = false)
    public Integer stock;

    @Column(name="fecha_alta", nullable = false)
    public LocalDate fechaAlta;


    public Producto(LocalDate fechaAlta, Integer stock, Integer precio, String descripcion, String nombre, String codigoSku, Long idProduct) {
        this.fechaAlta = fechaAlta;
        this.stock = stock;
        this.precio = precio;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.codigoSku = codigoSku;
        this.idProduct = idProduct;
    }

    public Producto() {
    }


    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getCodigoSku() {
        return codigoSku;
    }

    public void setCodigoSku(String codigoSku) {
        this.codigoSku = codigoSku;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
