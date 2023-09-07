package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    void update(User user);

    void delete(Long id);

    List<User> findAll();

    User findById(Long id);
}
