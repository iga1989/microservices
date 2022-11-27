package edu.miu.productservice.service;

import edu.miu.productservice.model.Product;
import org.springframework.stereotype.Service;
@Service
public interface ProductService {

    public Iterable<Product> getAll();

    public Product getById(Integer id);

}
