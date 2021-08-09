package com.nexos.mod.automovile.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexos.mod.automovile.queries.AutomotivesQuery;
import com.nexos.mod.automovile.services.AutomovilesSearchServices;
import com.nexos.mod.core.dtos.NameDto;
import com.nexos.mod.core.entities.Automotives;
import com.nexos.mod.core.repositories.AutomotivesRepositories;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutomovilesSearchServicesImpl implements AutomovilesSearchServices {
  private final AutomotivesRepositories automotivesRepositories;

  @Autowired
  public AutomovilesSearchServicesImpl(final AutomotivesRepositories automotivesRepositories) {
    this.automotivesRepositories = automotivesRepositories;
  }

  @Override
  public List<NameDto> getAutomoviles() {
    final List<Automotives> tipsHumanizationList = automotivesRepositories.findAll();
    return tipsHumanizationList.stream().map(AutomotivesQuery::mapperEntityToDto).collect(Collectors.toList());
  }
}
