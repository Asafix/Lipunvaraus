package com.example.Lipunvaraus.bean;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Lipunvaraus.bean.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}