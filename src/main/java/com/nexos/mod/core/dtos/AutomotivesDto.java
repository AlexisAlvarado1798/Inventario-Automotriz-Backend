package com.nexos.mod.core.dtos;

public class AutomotivesDto extends NameDto {
  private Long autModel;
  private String atuName;
  private NameDto typAuto;
  private Long typAut;

  public AutomotivesDto(final Long id, final String code, final String description) {
    super(id, code, description);

  }

  public Long getAutModel() {
    return autModel;
  }

  public void setAutModel(final Long autModel) {
    this.autModel = autModel;
  }

  public String getAtuName() {
    return atuName;
  }

  public void setAtuName(final String atuName) {
    this.atuName = atuName;
  }

  public Long getTypAut() {
    return typAut;
  }

  public void setTypAut(final Long typAut) {
    this.typAut = typAut;
  }

  public NameDto getTypAuto() {
    return typAuto;
  }

  public void setTypAuto(final NameDto typAuto) {
    this.typAuto = typAuto;
  }
}
