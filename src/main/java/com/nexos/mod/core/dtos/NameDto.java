package com.nexos.mod.core.dtos;

import java.util.Date;

public class NameDto {
  private Long id;
  private String code;
  private String description;

  private Date dateInventory;
  private String userId;

  public NameDto() {
  }

  public NameDto(final Long id, final String code, final String description) {
    this.id = id;
    this.code = code;
    this.description = description;
  }

  public NameDto(final Long id, final String code, final String description, final Date dateInventory) {
    this.id = id;
    this.code = code;
    this.description = description;
    this.dateInventory = dateInventory;
  }

  public NameDto(final Long id, final String code, final String description, final Date dateInventory,
      final String userId) {
    this.id = id;
    this.code = code;
    this.description = description;
    this.dateInventory = dateInventory;
    this.userId = userId;
  }

  public Long getId() {
    return id;
  }

  public void setId(final Long id) {
    this.id = id;
  }

  public String getCode() {
    return code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public Date getDateInventory() {
    return dateInventory;
  }

  public void setDateInventory(final Date dateInventory) {
    this.dateInventory = dateInventory;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(final String userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "NameDto{" + "id=" + id + ", code='" + code + '\'' + ", description='" + description + '\'' + '}';
  }
}
