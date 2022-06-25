package com.abdushukur.interprobe_bootcamp_homework.dao;

import com.abdushukur.interprobe_bootcamp_homework.controller.CommentController;
import com.abdushukur.interprobe_bootcamp_homework.entity.Product;
import com.abdushukur.interprobe_bootcamp_homework.entity.ProductComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentDao extends JpaRepository <ProductComment,Long> {
    List<ProductComment> findCommentsByProductId(Long id);
    List<ProductComment> findCommentsByUserId(Long id);
}
