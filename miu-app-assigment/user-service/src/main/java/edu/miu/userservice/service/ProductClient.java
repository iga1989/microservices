package edu.miu.userservice.service;

import edu.miu.userservice.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "PRODUCT-SERVICE",url = "http://localhost:9090")
public interface ProductClient {

    @GetMapping("/products")
    public List<ProductDto> getAllProducts();
}
