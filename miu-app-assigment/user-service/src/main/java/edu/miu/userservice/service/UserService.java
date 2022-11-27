package edu.miu.userservice.service;

import edu.miu.userservice.model.User;
import org.springframework.stereotype.Service;
@Service
public interface UserService {
    public Iterable<User>  getAll();
}
