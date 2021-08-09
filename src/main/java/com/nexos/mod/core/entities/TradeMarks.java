package com.nexos.mod.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRADEMARKS")
public class TradeMarks implements Serializable {
  private Long traId;
  private String traCode;
  private String traDescription;

  @Id
  @Column(name = "TRA_ID")
  public Long getTraId() {
    return traId;
  }

  public void setTraId(final Long traId) {
    this.traId = traId;
  }

  @Column(name = "TRA_CODE")
  public String getTraCode() {
    return traCode;
  }

  public void setTraCode(final String traCode) {
    this.traCode = traCode;
  }

  @Column(name = "TRA_DESCRIPTION")
  public String getTraDescription() {
    return traDescription;
  }

  public void setTraDescription(final String traDescription) {
    this.traDescription = traDescription;
  }
}
