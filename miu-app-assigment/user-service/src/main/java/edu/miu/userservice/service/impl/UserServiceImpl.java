package edu.miu.userservice.service.impl;

import edu.miu.userservice.model.User;
import edu.miu.userservice.repository.UserRepository;
import edu.miu.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
}
