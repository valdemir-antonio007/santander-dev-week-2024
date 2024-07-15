package me.dio.service;

import me.dio.domain.User;

public interface UserService {

    User findById(Long id);

    User createUser(User user);
}
