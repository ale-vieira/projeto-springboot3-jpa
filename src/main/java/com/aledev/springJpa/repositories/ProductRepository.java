package com.aledev.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aledev.springJpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
