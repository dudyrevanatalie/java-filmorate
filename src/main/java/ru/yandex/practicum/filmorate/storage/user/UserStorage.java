package ru.yandex.practicum.filmorate.storage.user;

import ru.yandex.practicum.filmorate.model.User;

import java.util.List;

public interface UserStorage {
    void add(User user);
    User getById(long id);
    List<User> findAll();
}
