package com.nexos.mod.core.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(User.class)
public class User_ implements Serializable {
  public static volatile SingularAttribute<User, Long> userId;
  public static volatile SingularAttribute<User, String> userName;
  public static volatile SingularAttribute<User, Date> userAdmissionDate;
  public static volatile SingularAttribute<User, String> userCode;
  public static volatile SingularAttribute<User, Long> rolId;

}
