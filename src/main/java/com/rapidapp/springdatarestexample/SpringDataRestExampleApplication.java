package com.rapidapp.springdatarestexample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringDataRestExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestExampleApplication.class, args);
    }

}

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private BigDecimal price;
}

@RepositoryRestResource
interface ProductRepository extends CrudRepository<Product, Integer> { }