package com.example.spring_boot_lessons.repo;

import com.example.spring_boot_lessons.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
