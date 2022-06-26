package com.abdushukur.interprobe_bootcamp_homework.controller;


import com.abdushukur.interprobe_bootcamp_homework.dao.ProductDao;
import com.abdushukur.interprobe_bootcamp_homework.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductDao productDao;
    //6. Son kullanma tarihi geçmiş ürünleri listeleyen bir metot yazınız.
    @GetMapping("/productsExpired")
    public ResponseEntity getProductsExpired() {
        List<Product> ExpiredProducts = productDao.findProductsByIsExpiredEquals1();
        return ResponseEntity.ok(ExpiredProducts);
    }

    //7. Son kullanma tarihi geçmemiş ürünleri listeleyen bir metot yazınız. (Son kullanma tarihi boş olanlar da gelmeli.)
    @GetMapping("/productsNotExpired")
    public ResponseEntity getProductsNotExpired() {
        List<Product> ExpiredProducts = productDao.findProductsByIsExpiredEquals0();
        return ResponseEntity.ok(ExpiredProducts);
    }

}
