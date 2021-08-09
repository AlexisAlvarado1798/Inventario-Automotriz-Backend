package com.nexos.mod.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.nexos.mod.core.entities.SpareParts;

public interface SpartPartsRepositories extends JpaRepository<SpareParts, Long>, JpaSpecificationExecutor<SpareParts> {
}
