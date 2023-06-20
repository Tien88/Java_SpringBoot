package com.tutorial.demo.Springboot.Tutorial.repositories;

import com.tutorial.demo.Springboot.Tutorial.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByProductName(String productName);
}
