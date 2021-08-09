package com.nexos.mod.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.nexos.mod.core.entities.InventoryDetails;

public interface InventoryDetailsRepositories
    extends JpaRepository<InventoryDetails, Long>, JpaSpecificationExecutor<InventoryDetails> {
}
