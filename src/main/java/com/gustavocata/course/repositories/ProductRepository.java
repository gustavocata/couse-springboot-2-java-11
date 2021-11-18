package com.gustavocata.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocata.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
