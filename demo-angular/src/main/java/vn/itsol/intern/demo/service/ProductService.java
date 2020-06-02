package vn.itsol.intern.demo.service;

import vn.itsol.intern.demo.entities.Product;

import java.util.List;
import java.util.Optional;

/**
 * ITSOL DEV
 *
 * @author maint on 5/28/2020
 */
public interface ProductService {
    List<Product> findAll();
    Product save(Product product);
    void update(Product product);
    void delete(Long id);
    Optional<Product> findOne(Long id);
}
