package com.thunyapong.crudapi.repository;

import com.thunyapong.crudapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
