package com.nexos.mod.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.nexos.mod.core.entities.User;

public interface UsersRepositories extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}
