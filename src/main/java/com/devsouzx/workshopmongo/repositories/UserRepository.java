package com.devsouzx.workshopmongo.repositories;

import com.devsouzx.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
