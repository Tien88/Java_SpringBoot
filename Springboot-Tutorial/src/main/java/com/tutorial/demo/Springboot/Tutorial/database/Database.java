package com.tutorial.demo.Springboot.Tutorial.database;

import com.tutorial.demo.Springboot.Tutorial.repositories.ProductRepository;
import com.tutorial.demo.Springboot.Tutorial.models.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Now connect with mysql using JPA
// docker run -d --rm --name mysql-spring-boot -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_USER=tientm -e MYSQL_PASSWORD=123456 -e MYSQL_DATABASE=test_db -p 3309:3306 --volume mysql-spring-boot-volume:/var/lib/mysql mysql:latest
// mysql -h localhost -P 3309 --protocol=tcp -u tientm -p
// show databases;
// use test_db;
// show tables;
// select * from tblProduct;
@Configuration
public class Database {
    //logger
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
//                Product productA = new Product("Macbook Pro 16 M2", 2022, 6700.0, "");
//                Product productB = new Product("Macbook Air 15 M2", 2021, 3300.0, "");
//                logger.info("insert data: " +productRepository.save(productA));
//                logger.info("insert data: " +productRepository.save(productB));
            }
        };
    }
}
