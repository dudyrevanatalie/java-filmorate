package ru.yandex.practicum.filmorate.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
public class Film {
    private long id;
    private String name;
    private String description;
    private LocalDate releaseDate;
    private int duration;
    private Set<Long> usersWhoLikes = new HashSet<>();

    public Set<Long> getUsersWhoLikes() {
        return usersWhoLikes;
    }

    public void addToUsersWhoLikes(long id) {
        usersWhoLikes.add(id);
    }

    public void removeFromUsersWhoLikes(long id) {
        usersWhoLikes.remove(id);
    }

}