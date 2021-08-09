package com.nexos.mod.core.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "INVENTORIES")
public class Inventories implements Serializable {
  private Long invId;
  private String invCode;
  private String invDescription;
  private Date invDateInventory;
  private User users;


  @Id
  @Column(name = "INV_ID")
  public Long getInvId() {
    return invId;
  }

  public void setInvId(final Long invId) {
    this.invId = invId;
  }

  @Column(name = "INV_CODE")
  public String getInvCode() {
    return invCode;
  }

  public void setInvCode(final String invCode) {
    this.invCode = invCode;
  }

  @Column(name = "INV_DESCRIPTION")
  public String getInvDescription() {
    return invDescription;
  }

  public void setInvDescription(final String invDescription) {
    this.invDescription = invDescription;
  }

  @Column(name = "INV_DATE_INVENTORY")
  public Date getInvDateInventory() {
    return invDateInventory;
  }

  public void setInvDateInventory(final Date invDateInventory) {
    this.invDateInventory = invDateInventory;
  }


  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "USER_ID", updatable = false, insertable = false)
  public User getUsers() {
    return users;
  }

  public void setUsers(final User users) {
    this.users = users;
  }

  @Override
  public String toString() {
    return "Inventories{" + "invId=" + invId + ", invCode='" + invCode + '\'' + ", invDescription='" + invDescription
        + '\'' + ", invDateInventory=" + invDateInventory + '}';
  }
}
