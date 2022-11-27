package edu.miu.productservice.service.impl;

import edu.miu.productservice.model.Product;
import edu.miu.productservice.repository.ProductRepository;
import edu.miu.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    @Override
    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getById(Integer id) {
        return productRepository.findById(id).orElse(null);
    }
}
