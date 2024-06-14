package com.devsouzx.workshopmongo.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User implements Serializable {
    private String id;
    private String name;
    private String email;
}
