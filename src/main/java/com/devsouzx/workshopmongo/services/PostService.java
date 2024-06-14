package com.devsouzx.workshopmongo.services;

import com.devsouzx.workshopmongo.domain.Post;
import com.devsouzx.workshopmongo.repositories.PostRepository;
import com.devsouzx.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Post not found"));
    }
}