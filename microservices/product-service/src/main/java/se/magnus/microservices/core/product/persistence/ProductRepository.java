package se.magnus.microservices.core.product.persistence;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, String> {
    Optional<ProductEntity> findByProductId(int productId);

    Page<ProductEntity> findAll(Pageable pageable);
}