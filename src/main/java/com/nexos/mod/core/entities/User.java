package com.nexos.mod.core.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
  private Long userId;
  private String userName;
  private Long userAge;
  private Date userAdmissionDate;
  private String userCode;
  private Long rolId;

  @Id
  @Column(name = "USER_ID")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(final Long userId) {
    this.userId = userId;
  }

  @Column(name = "USER_NAME")
  public String getUserName() {
    return userName;
  }

  public void setUserName(final String userName) {
    this.userName = userName;
  }

  @Column(name = "USER_AGE")
  public Long getUserAge() {
    return userAge;
  }

  public void setUserAge(final Long userAge) {
    this.userAge = userAge;
  }

  @Column(name = "USER_ADMISSION_DATE")
  public Date getUserAdmissionDate() {
    return userAdmissionDate;
  }

  public void setUserAdmissionDate(final Date userAdmissionDate) {
    this.userAdmissionDate = userAdmissionDate;
  }

  @Column(name = "USER_CODE")
  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(final String userCode) {
    this.userCode = userCode;
  }

  @Column(name = "ROL_ID")
  public Long getRolId() {
    return rolId;
  }

  public void setRolId(final Long rolId) {
    this.rolId = rolId;
  }

  @Override
  public String toString() {
    return "User{" + "userId=" + userId + ", userName='" + userName + '\'' + ", userAdmissionDate=" + userAdmissionDate
        + ", userCode='" + userCode + '\'' + ", rolId=" + rolId + '}';
  }
}
