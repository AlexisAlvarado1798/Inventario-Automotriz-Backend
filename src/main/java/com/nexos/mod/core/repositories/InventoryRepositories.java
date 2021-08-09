package com.nexos.mod.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.nexos.mod.core.entities.Inventories;

public interface InventoryRepositories extends JpaRepository<Inventories, Long>, JpaSpecificationExecutor<Inventories> {
}
