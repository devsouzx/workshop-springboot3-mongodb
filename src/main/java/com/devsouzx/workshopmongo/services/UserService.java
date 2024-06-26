package com.devsouzx.workshopmongo.services;

import com.devsouzx.workshopmongo.domain.User;
import com.devsouzx.workshopmongo.dto.UserDTO;
import com.devsouzx.workshopmongo.repositories.UserRepository;
import com.devsouzx.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(String id) {
        userRepository.deleteById(id);
    }

    public User update(String id, User user) {
        User entity = findById(id);
        updateDate(entity, user);
        return userRepository.save(entity);
    }

    private void updateDate(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
