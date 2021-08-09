package com.nexos.mod.invendeta.queries;

import org.springframework.data.jpa.domain.Specification;

import com.nexos.mod.core.dtos.InventaryDetailsDto;
import com.nexos.mod.core.dtos.NameDto;
import com.nexos.mod.core.dtos.UserDto;
import com.nexos.mod.core.entities.Inventories;
import com.nexos.mod.core.entities.Inventories_;
import com.nexos.mod.core.entities.InventoryDetails;
import com.nexos.mod.core.entities.InventoryDetails_;
import com.nexos.mod.core.entities.SpareParts;
import com.nexos.mod.core.entities.User;

import java.math.BigDecimal;

import javax.jws.soap.SOAPBinding.Use;

public class InventaryDetailsQuery {
  public static InventaryDetailsDto mapperEntityToDto(final InventoryDetails inventoryDetails) {
    final InventaryDetailsDto inventaryDetailsDto =
        new InventaryDetailsDto(inventoryDetails.getDetId(), inventoryDetails.getInvId(), inventoryDetails.getSpaId(),
            inventoryDetails.getAutId(), inventoryDetails.getDetStock(), inventoryDetails.getDetInitialStock(),
            inventoryDetails.getDetPrice());
    inventaryDetailsDto.setDetId(inventoryDetails.getDetId());
    inventaryDetailsDto.setInvId(inventoryDetails.getInvId());
    inventaryDetailsDto.setSpaId(inventoryDetails.getSpaId());
    inventaryDetailsDto.setAutId(inventoryDetails.getAutId());
    inventaryDetailsDto.setDetStock(inventoryDetails.getDetStock());
    inventaryDetailsDto.setDetInitialStock(inventoryDetails.getDetInitialStock());
    inventaryDetailsDto.setDetPrice(inventoryDetails.getDetPrice());

    if (inventoryDetails.getDetPrice() != null) {
      inventaryDetailsDto.setInventory(
          new NameDto(inventoryDetails.getInventories().getInvId(), inventoryDetails.getInventories().getInvCode(),
              inventoryDetails.getInventories().getInvDescription(), inventoryDetails.getInventories().getInvDateInventory(), inventoryDetails.getInventories().getUsers().getUserName()));
      inventaryDetailsDto.setSpareParts(
          new NameDto(inventoryDetails.getSpareParts().getSpaId(), inventoryDetails.getSpareParts().getSpaCode(),
              inventoryDetails.getSpareParts().getSpaName()));
      inventaryDetailsDto.setSparePartsTypId(
          new NameDto(inventoryDetails.getSpareParts().getTypesAutomotives().getTypId(),
              inventoryDetails.getSpareParts().getTypesAutomotives().getTypDescription(),
              inventoryDetails.getSpareParts().getTypesAutomotives().getTypDescription()));

      inventaryDetailsDto.setSparePartsTraId(new NameDto(inventoryDetails.getSpareParts().getTradeMarks().getTraId(),
          inventoryDetails.getSpareParts().getTradeMarks().getTraCode(),
          inventoryDetails.getSpareParts().getTradeMarks().getTraDescription()));
    }

    return inventaryDetailsDto;
  }

  public Specification<InventoryDetails> obtenerDetalle(final BigDecimal id) {
    return ((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder
        .and(criteriaBuilder.equal(root.get(InventoryDetails_.invId), id)));
  }

  public static NameDto mapperEntityToDtoList(final SpareParts spareParts) {
    final NameDto sparePartDto = new NameDto();
    sparePartDto.setId(spareParts.getSpaId());
    sparePartDto.setCode(spareParts.getSpaCode());
    sparePartDto.setDescription(spareParts.getSpaName());
    return sparePartDto;
  }

  public static Specification<Inventories> searchByCode(final String code) {
    return ((root, cq, cb) -> cb.and(cb.equal(root.get(Inventories_.invCode), code)));
  }

  /**
   * @param inventoryDtoView Created
   * @return
   */

  public static Inventories mapperDtoToEntity(final NameDto inventoryDtoView) {
    final Inventories entity = new Inventories();
    entity.setInvId(inventoryDtoView.getId());
    entity.setInvCode(inventoryDtoView.getCode());
    entity.setInvDescription(inventoryDtoView.getDescription());
    entity.setInvDateInventory(inventoryDtoView.getDateInventory());
    return entity;
  }

  /**
   * @param inventaryDetailsDto Created
   * @return
   */

  public static InventoryDetails mapperDtoToEntity(final InventaryDetailsDto inventaryDetailsDto) {
    final InventoryDetails entity = new InventoryDetails();
    entity.setDetId(inventaryDetailsDto.getDetId());
    entity.setInvId(inventaryDetailsDto.getInvId());
    entity.setSpaId(inventaryDetailsDto.getSpaId());
    entity.setAutId(inventaryDetailsDto.getAutId());
    entity.setDetStock(inventaryDetailsDto.getDetStock());
    entity.setDetInitialStock(inventaryDetailsDto.getDetInitialStock());
    entity.setDetPrice(inventaryDetailsDto.getDetPrice());
    return entity;
  }

  public static UserDto mapperEntityToDtoListUser(final User user) {
    final UserDto userDto = new UserDto();
    userDto.setUserId(user.getUserId());
    userDto.setUserName(user.getUserName());
    userDto.setUserAge(user.getUserAge());
    userDto.setUserAdmissionDate(user.getUserAdmissionDate());
    userDto.setUserCode(user.getUserCode());
    userDto.setRolId(user.getRolId());
    return userDto;
  }

}

/**
 *
 */





