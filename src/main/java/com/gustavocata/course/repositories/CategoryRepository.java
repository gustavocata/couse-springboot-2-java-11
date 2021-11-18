package com.gustavocata.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocata.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
