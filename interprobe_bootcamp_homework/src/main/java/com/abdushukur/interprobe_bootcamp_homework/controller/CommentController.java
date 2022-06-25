package com.abdushukur.interprobe_bootcamp_homework.controller;

import com.abdushukur.interprobe_bootcamp_homework.dao.CommentDao;
import com.abdushukur.interprobe_bootcamp_homework.entity.ProductComment;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentDao commentDao;

    // 2. Bir ürüne ait yorumları listeleyen bir metot yazınız.
    @GetMapping("/commentsByProductId/{id}")
    public ResponseEntity findCommentsByProductId(@PathVariable Long id)  {
     List<ProductComment> comments = commentDao.findCommentsByProductId(id);
     return ResponseEntity.ok(comments);
    }

    //3. Verilen tarih aralıklarında belirli bir ürüne yapılmış olan yorumları gösteren bir metot yazınız.

    //4. Bir kullanıcının yapmış olduğu yorumları listeleyen bir metot yazınız.
    @GetMapping("/commentsbyuserid/{id}")
    public ResponseEntity findCommentsByUserId(@PathVariable Long id)  {
        List<ProductComment> comments = commentDao.findCommentsByUserId(id);
        return ResponseEntity.ok(comments);
    }
    //5. Bir kullanıcının belirli tarihler aralığında yapmış olduğu yorumları gösteren bir metot yazınız.


}
