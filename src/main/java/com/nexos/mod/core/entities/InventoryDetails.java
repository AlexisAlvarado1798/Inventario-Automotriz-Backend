package com.nexos.mod.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORY_DETAILS")
public class InventoryDetails implements Serializable {
  private Long detId;
  private Long invId;
  private Long spaId;
  private Long autId;
  private int detStock;
  private int detInitialStock;
  private Long detPrice;
  private Inventories inventories;
  private SpareParts spareParts;

  @Id
  @Column(name = "DET_ID")
  public Long getDetId() {
    return detId;
  }

  public void setDetId(final Long detId) {
    this.detId = detId;
  }

  @Column(name = "INV_ID")
  public Long getInvId() {
    return invId;
  }

  public void setInvId(final Long invId) {
    this.invId = invId;
  }

  @Column(name = "SPA_ID")
  public Long getSpaId() {
    return spaId;
  }

  public void setSpaId(final Long spaId) {
    this.spaId = spaId;
  }

  @Column(name = "AUT_ID")
  public Long getAutId() {
    return autId;
  }

  public void setAutId(final Long autId) {
    this.autId = autId;
  }

  @Column(name = "DET_STOCK")
  public int getDetStock() {
    return detStock;
  }

  public void setDetStock(final int detStock) {
    this.detStock = detStock;
  }

  @Column(name = "DET_INITIAL_STOCK")
  public int getDetInitialStock() {
    return detInitialStock;
  }

  public void setDetInitialStock(final int detInitialStock) {
    this.detInitialStock = detInitialStock;
  }

  @Column(name = "DET_PRICE")
  public Long getDetPrice() {
    return detPrice;
  }

  public void setDetPrice(final Long detPrice) {
    this.detPrice = detPrice;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "INV_ID", updatable = false, insertable = false)
  public Inventories getInventories() {
    return inventories;
  }

  public void setInventories(final Inventories inventories) {
    this.inventories = inventories;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "SPA_ID", updatable = false, insertable = false)
  public SpareParts getSpareParts() {
    return spareParts;
  }

  public void setSpareParts(final SpareParts spareParts) {
    this.spareParts = spareParts;
  }
}
