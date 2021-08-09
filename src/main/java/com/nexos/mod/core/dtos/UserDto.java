package com.nexos.mod.core.dtos;

import java.util.Date;

public class UserDto {
  private Long userId;
  private String userName;
  private Long userAge;
  private Date userAdmissionDate;
  private String userCode;
  private Long rolId;

  public Long getUserId() {
    return userId;
  }

  public void setUserId(final Long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(final String userName) {
    this.userName = userName;
  }

  public Long getUserAge() {
    return userAge;
  }

  public void setUserAge(final Long userAge) {
    this.userAge = userAge;
  }

  public Date getUserAdmissionDate() {
    return userAdmissionDate;
  }

  public void setUserAdmissionDate(final Date userAdmissionDate) {
    this.userAdmissionDate = userAdmissionDate;
  }

  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(final String userCode) {
    this.userCode = userCode;
  }

  public Long getRolId() {
    return rolId;
  }

  public void setRolId(final Long rolId) {
    this.rolId = rolId;
  }
}
