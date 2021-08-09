package com.nexos.mod.invendeta.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import com.nexos.mod.core.dtos.InventaryDetailsDto;
import com.nexos.mod.core.dtos.NameDto;
import com.nexos.mod.core.dtos.UserDto;
import com.nexos.mod.invendeta.services.InventaryDetailsSearchServices;

import java.util.List;

@InventaryDetailsController
public class InventaryDetailsSearchController {
  private final InventaryDetailsSearchServices inventaryDetailsSearchServices;

  public InventaryDetailsSearchController(final InventaryDetailsSearchServices inventaryDetailsSearchServices) {
    this.inventaryDetailsSearchServices = inventaryDetailsSearchServices;
  }

  @GetMapping(path = "/search/inventarydetails")
  public List<InventaryDetailsDto> getInventaryDetails() {
    return inventaryDetailsSearchServices.getInventaryDetails();
  }

  @GetMapping(path = "/search/spartparts")
  public List<NameDto> getSpareParts() {
    return inventaryDetailsSearchServices.getSpareParts();
  }
  @GetMapping(path = "/search/users")
  public List<UserDto> getUsers() {
    return inventaryDetailsSearchServices.getUsers();
  }
}
