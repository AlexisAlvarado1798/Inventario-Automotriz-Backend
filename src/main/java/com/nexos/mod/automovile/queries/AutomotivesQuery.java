package com.nexos.mod.automovile.queries;

import com.nexos.mod.core.dtos.AutomotivesDto;
import com.nexos.mod.core.dtos.NameDto;
import com.nexos.mod.core.entities.Automotives;

public class AutomotivesQuery {

  public static AutomotivesDto mapperEntityToDto(final Automotives automotives) {
    final AutomotivesDto nameDto =
        new AutomotivesDto(automotives.getAutId(), automotives.getAutDescription(), automotives.getAutCode());
    nameDto.setId(automotives.getAutId());
    nameDto.setCode(automotives.getAutCode());
    nameDto.setDescription(automotives.getAutDescription());

    if (automotives.getTypId() != null) {
      nameDto.setTypAuto(
          new NameDto(automotives.getTypesAutomotives().getTypId(), automotives.getTypesAutomotives().getTypCode(),
              automotives.getTypesAutomotives().getTypDescription()));

    }
    return nameDto;
  }
}
