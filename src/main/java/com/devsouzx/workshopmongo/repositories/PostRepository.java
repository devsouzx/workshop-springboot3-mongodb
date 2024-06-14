package com.devsouzx.workshopmongo.repositories;

import com.devsouzx.workshopmongo.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
