package edu.miu.userservice.controller;

import edu.miu.userservice.dto.ProductDto;
import edu.miu.userservice.model.User;
import edu.miu.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    private final RestTemplate restTemplate;

    @GetMapping
    public Iterable<User> getAll(){
        var result = restTemplate.getForObject("http://PRODUCT/products/1", ProductDto.class);

        System.out.println(result);

        return userService.getAll();
    }
}
