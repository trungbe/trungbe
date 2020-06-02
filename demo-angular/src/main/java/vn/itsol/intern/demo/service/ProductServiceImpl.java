package vn.itsol.intern.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.itsol.intern.demo.entities.Product;
import vn.itsol.intern.demo.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

/**
 * ITSOL DEV
 *
 * @author maint on 5/28/2020
 */
@Transactional
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void update(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findOne(Long id) {
        return productRepository.findById(id);
    }
}
