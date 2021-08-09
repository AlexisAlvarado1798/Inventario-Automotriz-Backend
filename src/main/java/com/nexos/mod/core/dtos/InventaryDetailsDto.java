package com.nexos.mod.core.dtos;

public class InventaryDetailsDto {
  private Long detId;
  private Long invId;
  private Long spaId;
  private Long autId;
  private int detStock;
  private int detInitialStock;
  private Long detPrice;

  private NameDto inventory;
  private NameDto spareParts;
  private NameDto sparePartsTypId;
  private NameDto sparePartsTraId;

  public InventaryDetailsDto() {

  }

  public InventaryDetailsDto(final Long detId, final Long invId, final Long spaId, final Long autId, final int detStock,
      final int detInitialStock, final Long detPrice) {
    this.detId = detId;
    this.invId = invId;
    this.spaId = spaId;
    this.autId = autId;
    this.detStock = detStock;
    this.detInitialStock = detInitialStock;
    this.detPrice = detPrice;
  }


  public Long getDetId() {
    return detId;
  }

  public void setDetId(final Long detId) {
    this.detId = detId;
  }

  public Long getInvId() {
    return invId;
  }

  public void setInvId(final Long invId) {
    this.invId = invId;
  }

  public Long getSpaId() {
    return spaId;
  }

  public void setSpaId(final Long spaId) {
    this.spaId = spaId;
  }

  public Long getAutId() {
    return autId;
  }

  public void setAutId(final Long autId) {
    this.autId = autId;
  }

  public int getDetStock() {
    return detStock;
  }

  public void setDetStock(final int detStock) {
    this.detStock = detStock;
  }

  public int getDetInitialStock() {
    return detInitialStock;
  }

  public void setDetInitialStock(final int detInitialStock) {
    this.detInitialStock = detInitialStock;
  }

  public Long getDetPrice() {
    return detPrice;
  }

  public void setDetPrice(final Long detPrice) {
    this.detPrice = detPrice;
  }

  public NameDto getInventory() {
    return inventory;
  }

  public void setInventory(final NameDto inventory) {
    this.inventory = inventory;
  }

  public NameDto getSpareParts() {
    return spareParts;
  }

  public void setSpareParts(final NameDto spareParts) {
    this.spareParts = spareParts;
  }

  public NameDto getSparePartsTypId() {
    return sparePartsTypId;
  }

  public void setSparePartsTypId(final NameDto sparePartsTypId) {
    this.sparePartsTypId = sparePartsTypId;
  }

  public NameDto getSparePartsTraId() {
    return sparePartsTraId;
  }

  public void setSparePartsTraId(final NameDto sparePartsTraId) {
    this.sparePartsTraId = sparePartsTraId;
  }

  @Override
  public String toString() {
    return "InventaryDetailsDto{" + "detId=" + detId + ", invId=" + invId + ", spaId=" + spaId + ", autId=" + autId
        + ", detStock=" + detStock + ", detInitialStock=" + detInitialStock + ", detPrice=" + detPrice + ", inventory="
        + inventory + '}';
  }
}
