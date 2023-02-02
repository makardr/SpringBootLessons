package com.example.SpringBootLessons.repo;

import com.example.SpringBootLessons.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
