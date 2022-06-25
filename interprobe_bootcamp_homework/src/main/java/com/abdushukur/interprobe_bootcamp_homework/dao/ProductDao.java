package com.abdushukur.interprobe_bootcamp_homework.dao;

import com.abdushukur.interprobe_bootcamp_homework.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao  extends JpaRepository <Product,Long>{

    @Query(value = "SELECT * FROM product WHERE IS_EXPIRED = 1", nativeQuery = true)
    List<Product> findProductsByIsExpiredEquals1();

    @Query(value = "SELECT * FROM product WHERE IS_EXPIRED = 0", nativeQuery = true)
    List<Product> findProductsByIsExpiredEquals0();
}
