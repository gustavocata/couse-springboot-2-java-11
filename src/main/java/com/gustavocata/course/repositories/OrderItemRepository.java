package com.gustavocata.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavocata.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
