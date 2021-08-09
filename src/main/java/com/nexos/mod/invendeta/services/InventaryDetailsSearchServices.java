package com.nexos.mod.invendeta.services;

import com.nexos.mod.core.dtos.InventaryDetailsDto;
import com.nexos.mod.core.dtos.NameDto;
import com.nexos.mod.core.dtos.UserDto;

import java.util.List;

public interface InventaryDetailsSearchServices {
  /**
   * @return
   */
  List<InventaryDetailsDto> getInventaryDetails();

  List<NameDto> getSpareParts();

  Boolean existInventoryByCode(String code);

  List<UserDto> getUsers();
}
