package com.devsouzx.workshopmongo.dto;

import com.devsouzx.workshopmongo.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDTO implements Serializable {
    private String id;
    private String name;

    public AuthorDTO(User user) {
        id = user.getId();
        name = user.getName();
    }
}
