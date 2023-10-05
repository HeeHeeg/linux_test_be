package com.example.gcptest.service;

import com.example.gcptest.domin.entity.User;
import com.example.gcptest.domin.request.UserRequest;
import com.example.gcptest.reopsitory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public void save(UserRequest request) {
        User user = User.builder()
                .name(request.getName())
                .description(request.getDescription())
                .build();

        repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

}
