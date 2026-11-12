package edu.altair.repositories;

import edu.altair.dtos.ProductoResponseDto;
import edu.altair.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ProductoRepository extends JpaRepository<Producto,Long> {


    boolean existsByCodigoSku(String codigoSku);

    Optional<ProductoResponseDto> findByCodigoSku(String codigoSku);

    void deleteByCodigoSku(String codigoSku);

}
