package com.nexos.mod.automovile.services;

import com.nexos.mod.core.dtos.NameDto;

import java.util.List;

public interface AutomovilesSearchServices {
  /**
   * @return
   */
  List<NameDto> getAutomoviles();
}
