package com.nexos.mod.invendeta.services;

import com.nexos.mod.core.dtos.InventaryDetailsDto;
import com.nexos.mod.core.dtos.NameDto;

public interface InventoryDetailsService {

  void createInventory(NameDto nameDto);

  void createInventoryDetails(InventaryDetailsDto inventaryDetailsDto);
}
