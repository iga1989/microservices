package edu.miu.productservice.controller;

import edu.miu.productservice.model.Product;
import edu.miu.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public Iterable<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable Integer id){
        return productService.getById(id);
    }
}
