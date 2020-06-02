package vn.itsol.intern.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.itsol.intern.demo.entities.Product;

import java.util.List;

/**
 * ITSOL DEV
 *
 * @author maint on 5/28/2020
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCode(String code);
}
