package com.devsouzx.workshopmongo.resources;

import com.devsouzx.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "maria", "mariaasasas");
        User joao = new User("2", "dadasd", "asdsdasd");
        List<User> users = new ArrayList<>(Arrays.asList(maria, joao));
        return ResponseEntity.ok(users);
    }
}
