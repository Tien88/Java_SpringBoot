package com.tutorial.demo.Springboot.Tutorial.models;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.Objects;

//POJO = Plain Object Java Object
@Entity
@Table(name="tblProduct")
public class Product {
    //This is "primary key"
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //you can also use "sequence"
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1 //increment by 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    @Column(name="`id`")
    private Long id;
    @Column(name="`productName`", nullable = false, unique = true, length = 300)
    private String productName;
    @Column(name="`year`")
    private int year;
    @Column(name="`price`")
    private Double price;
    @Column(name="`url`")
    private String url;
    //default constructor
    public Product() {}
    //calculated field = transient, not exist in MySQL
    @Transient
    private int age;
    private int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }
    public Product( String productName, int year, Double price, String url) {
        this.productName = productName;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }

}
