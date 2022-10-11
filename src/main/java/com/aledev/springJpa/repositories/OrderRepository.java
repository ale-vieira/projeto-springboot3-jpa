package com.aledev.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aledev.springJpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
