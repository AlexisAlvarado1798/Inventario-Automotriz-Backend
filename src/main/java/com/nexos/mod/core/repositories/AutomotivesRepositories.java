package com.nexos.mod.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.nexos.mod.core.entities.Automotives;

public interface AutomotivesRepositories extends JpaRepository<Automotives, Long>, JpaSpecificationExecutor<Automotives> {
}
