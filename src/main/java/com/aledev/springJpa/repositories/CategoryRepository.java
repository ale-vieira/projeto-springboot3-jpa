package com.aledev.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aledev.springJpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
