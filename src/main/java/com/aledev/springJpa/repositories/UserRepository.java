package com.aledev.springJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aledev.springJpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
