package com.lv.rest.service;

import com.lv.rest.bean.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoService {
    private static final List<User> users = new ArrayList<>(List.of(
            new User(1, "LeoI", LocalDate.now().minusYears(20)),
            new User(2, "LeoIII", LocalDate.now().minusYears(17)),
            new User(3, "LeoIV", LocalDate.now().minusYears(13)),
            new User(4, "LeoV", LocalDate.now().minusYears(25)),
            new User(5, "LeoXXX", LocalDate.now().minusYears(30))
    ));

    public List<User> findAll() {
        return users;
    }

    public User findById(Integer id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
