package com.shihri.springRest.services;

import com.shihri.springRest.model.UserRequest;
import com.shihri.springRest.entity.User;
import com.shihri.springRest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserRequest userRequest) {
        User user = User.builder()
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .age(userRequest.getAge())
                .mobile(userRequest.getMobile())
                .nationality(userRequest.getNationality())
                .build();

        return userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }
}
