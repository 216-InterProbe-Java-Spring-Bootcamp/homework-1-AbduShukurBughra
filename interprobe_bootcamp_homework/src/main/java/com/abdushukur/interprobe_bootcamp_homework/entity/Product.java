package com.abdushukur.interprobe_bootcamp_homework.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {

        @Id
        @GeneratedValue(generator = "PRODUCT")
        @SequenceGenerator(name = "PRODUCT", sequenceName = "PRODUCT_ID_SEQ")
        private Long id;

        @Column(name = "NAME", length = 100, nullable = false)
        private String name;

        @Column(name = "PRICE", length = 100, nullable = false)
        private String price;

        @Column(name = "EXPIRATION_DATE", length = 100, nullable = false)
        private String expirationDate; //

        @Column(name = "IS_EXPIRED", length = 100)
        private Integer isExpired;


}
