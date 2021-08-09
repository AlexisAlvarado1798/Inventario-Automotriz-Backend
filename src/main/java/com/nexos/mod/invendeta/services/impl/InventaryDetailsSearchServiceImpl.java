package com.nexos.mod.invendeta.services.impl;

import org.springframework.stereotype.Service;

import com.nexos.mod.core.dtos.InventaryDetailsDto;
import com.nexos.mod.core.dtos.NameDto;
import com.nexos.mod.core.dtos.UserDto;
import com.nexos.mod.core.entities.InventoryDetails;
import com.nexos.mod.core.entities.SpareParts;
import com.nexos.mod.core.entities.User;
import com.nexos.mod.core.repositories.InventoryDetailsRepositories;
import com.nexos.mod.core.repositories.InventoryRepositories;
import com.nexos.mod.core.repositories.SpartPartsRepositories;
import com.nexos.mod.core.repositories.UsersRepositories;
import com.nexos.mod.invendeta.queries.InventaryDetailsQuery;
import com.nexos.mod.invendeta.services.InventaryDetailsSearchServices;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InventaryDetailsSearchServiceImpl implements InventaryDetailsSearchServices {

  private final InventoryDetailsRepositories inventoryDetailsRepositories;
  private final SpartPartsRepositories spartPartsRepositories;
  private final InventoryRepositories inventoryRepositories;
  private final UsersRepositories usersRepositories;

  public InventaryDetailsSearchServiceImpl(final InventoryDetailsRepositories inventoryDetailsRepositories,
      final SpartPartsRepositories spartPartsRepositories, final InventoryRepositories inventoryRepositories,
      final UsersRepositories usersRepositories) {
    this.inventoryDetailsRepositories = inventoryDetailsRepositories;
    this.spartPartsRepositories = spartPartsRepositories;
    this.inventoryRepositories = inventoryRepositories;
    this.usersRepositories = usersRepositories;
  }

  @Override
  public List<InventaryDetailsDto> getInventaryDetails() {
    final List<InventoryDetails> tipsHumanizationList = inventoryDetailsRepositories.findAll();
    return tipsHumanizationList.stream().map(InventaryDetailsQuery::mapperEntityToDto).collect(Collectors.toList());
  }

  @Override
  public List<NameDto> getSpareParts() {
    final List<SpareParts> tipsHumanizationList = spartPartsRepositories.findAll();
    return tipsHumanizationList.stream().map(InventaryDetailsQuery::mapperEntityToDtoList).collect(Collectors.toList());
  }

  @Override
  public List<UserDto> getUsers() {
    final List<User> tipsHumanizationList = usersRepositories.findAll();
    return tipsHumanizationList.stream().map(InventaryDetailsQuery::mapperEntityToDtoListUser)
        .collect(Collectors.toList());
  }

  @Override
  public Boolean existInventoryByCode(final String code) {
    return inventoryRepositories.count(InventaryDetailsQuery.searchByCode(code)) > 0;
  }

}
