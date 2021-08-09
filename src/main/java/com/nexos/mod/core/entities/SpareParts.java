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
@Table(name = "SPARE_PARTS")
public class SpareParts implements Serializable {
  private Long spaId;
  private Long traId;
  private String spaCode;
  private String spaDescription;
  private String spaName;
  private Long typId;

  private TypesAutomotives typesAutomotives;
  private TradeMarks tradeMarks;

  @Id
  @Column(name = "SPA_ID")
  public Long getSpaId() {
    return spaId;
  }

  public void setSpaId(final Long spaId) {
    this.spaId = spaId;
  }

  @Column(name = "TRA_ID")
  public Long getTraId() {
    return traId;
  }

  public void setTraId(final Long traId) {
    this.traId = traId;
  }

  @Column(name = "SPA_CODE")
  public String getSpaCode() {
    return spaCode;
  }

  public void setSpaCode(final String spaCode) {
    this.spaCode = spaCode;
  }

  @Column(name = "SPA_DESCRIPTION")
  public String getSpaDescription() {
    return spaDescription;
  }

  public void setSpaDescription(final String spaDescription) {
    this.spaDescription = spaDescription;
  }

  @Column(name = "SPA_NAME")
  public String getSpaName() {
    return spaName;
  }

  public void setSpaName(final String spaName) {
    this.spaName = spaName;
  }

  @Column(name = "TYP_ID")
  public Long getTypId() {
    return typId;
  }

  public void setTypId(final Long typId) {
    this.typId = typId;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "TYP_ID", updatable = false, insertable = false)
  public TypesAutomotives getTypesAutomotives() {
    return typesAutomotives;
  }

  public void setTypesAutomotives(final TypesAutomotives typesAutomotives) {
    this.typesAutomotives = typesAutomotives;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "TRA_ID", updatable = false, insertable = false)
  public TradeMarks getTradeMarks() {
    return tradeMarks;
  }

  public void setTradeMarks(final TradeMarks tradeMarks) {
    this.tradeMarks = tradeMarks;
  }
}
