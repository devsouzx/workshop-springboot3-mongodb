package com.devsouzx.workshopmongo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
public class Post implements Serializable {
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
}
