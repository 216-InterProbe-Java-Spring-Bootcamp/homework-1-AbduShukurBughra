package com.abdushukur.interprobe_bootcamp_homework.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_COMMENT")
public class ProductComment {

    @Id
    @GeneratedValue(generator = "PRODUCT_COMMENT")
    @SequenceGenerator(name="PRODUCT_COMMENT", sequenceName = "PRODUCT_COMMENT_ID_SEQ")
    private Long id;

    @Column(name = "COMMENT",length =500)
    private String comment;

    @Column(name = "COMMENT_DATE")
    private String commentDate;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "USER_ID")
    private String userId;



}
