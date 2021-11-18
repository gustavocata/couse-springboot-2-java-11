package com.gustavocata.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocata.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
