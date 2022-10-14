package com.aledev.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aledev.springJpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
