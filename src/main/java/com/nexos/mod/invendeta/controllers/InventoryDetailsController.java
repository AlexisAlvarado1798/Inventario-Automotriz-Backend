package com.nexos.mod.invendeta.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.nexos.mod.core.dtos.InventaryDetailsDto;
import com.nexos.mod.core.dtos.NameDto;
import com.nexos.mod.invendeta.services.InventoryDetailsService;

@InventaryDetailsController
public class InventoryDetailsController {
  private final InventoryDetailsService inventoryDetailsService;

  public InventoryDetailsController(final InventoryDetailsService inventoryDetailsService) {
    this.inventoryDetailsService = inventoryDetailsService;
  }

  @PostMapping(path = "/inventory")
  @ResponseStatus(HttpStatus.CREATED)
  public void createTipHumanization(@RequestBody final NameDto inventoryDto) {
    inventoryDetailsService.createInventory(inventoryDto);
  }

  @PostMapping(path = "/inventorydetails")
  @ResponseStatus(HttpStatus.CREATED)
  public void createInventoryDetails(@RequestBody final InventaryDetailsDto inventaryDetailsDto) {
    inventoryDetailsService.createInventoryDetails(inventaryDetailsDto);
  }
}
