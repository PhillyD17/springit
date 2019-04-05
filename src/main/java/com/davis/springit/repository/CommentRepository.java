package com.davis.springit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.davis.springit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
