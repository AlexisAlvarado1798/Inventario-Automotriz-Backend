package com.nexos.mod.invendeta.services.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.nexos.mod.core.dtos.InventaryDetailsDto;
import com.nexos.mod.core.dtos.NameDto;
import com.nexos.mod.core.repositories.InventoryDetailsRepositories;
import com.nexos.mod.core.repositories.InventoryRepositories;
import com.nexos.mod.invendeta.queries.InventaryDetailsQuery;
import com.nexos.mod.invendeta.services.InventaryDetailsSearchServices;
import com.nexos.mod.invendeta.services.InventoryDetailsService;

import javax.transaction.Transactional;

@Service
public class InventoryDetailsImpl implements InventoryDetailsService {
  private final InventoryDetailsRepositories inventoryDetailsRepositories;
  private final InventoryRepositories inventoryRepositories;
  private final InventaryDetailsSearchServices inventaryDetailsSearchServices;

  public InventoryDetailsImpl(final InventoryDetailsRepositories inventoryDetailsRepositories,
      final InventoryRepositories inventoryRepositories,
      final InventaryDetailsSearchServices inventaryDetailsSearchServices) {
    this.inventoryDetailsRepositories = inventoryDetailsRepositories;
    this.inventoryRepositories = inventoryRepositories;
    this.inventaryDetailsSearchServices = inventaryDetailsSearchServices;
  }

  @Override
  @Transactional
  public void createInventory(final NameDto inventoryDto) {
    validInventory(inventoryDto);

    if (inventaryDetailsSearchServices.existInventoryByCode(inventoryDto.getCode())) {
      throw new HttpClientErrorException(HttpStatus.BAD_GATEWAY, "Ya existe un inventario con ese codigo");
    }
    inventoryRepositories.save(InventaryDetailsQuery.mapperDtoToEntity(inventoryDto));
  }

  private void validInventory(final NameDto inventoryDto) {
    if (inventoryDto.getCode() == null || inventoryDto.getDescription() == null) {
      throw new HttpClientErrorException(HttpStatus.BAD_GATEWAY, "Campo obligatorio.");
    }
  }

  @Override
  @Transactional
  public void createInventoryDetails(final InventaryDetailsDto inventaryDetailsDto) {
    validInventoryDetails(inventaryDetailsDto);
    inventoryDetailsRepositories.save(InventaryDetailsQuery.mapperDtoToEntity(inventaryDetailsDto));
  }

  private void validInventoryDetails(final InventaryDetailsDto inventaryDetailsDto) {
    if (inventaryDetailsDto.getDetPrice() == null || inventaryDetailsDto.getDetInitialStock() == 0) {
      throw new HttpClientErrorException(HttpStatus.BAD_GATEWAY, "Campo obligatorio.");
    }
  }


}
