package com.TeleApps.springSecurityJwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TeleApps.springSecurityJwt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);
}
