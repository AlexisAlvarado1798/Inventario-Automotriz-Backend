package com.nexos.mod.automovile.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.nexos.mod.automovile.services.AutomovilesSearchServices;
import com.nexos.mod.core.dtos.NameDto;

import java.util.List;

@AutomovilesController
public class AutomovilesSearchController {

  private final AutomovilesSearchServices automovilesSearchServices;

  @Autowired
  public AutomovilesSearchController(final AutomovilesSearchServices automovilesSearchServices) {
    this.automovilesSearchServices = automovilesSearchServices;
  }

  @GetMapping(path = "/search/automoviles")
  public List<NameDto> getAutomoviles() {
    return automovilesSearchServices.getAutomoviles();
  }



}
