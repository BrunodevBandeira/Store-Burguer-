package com.api.burger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.burger.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
}
