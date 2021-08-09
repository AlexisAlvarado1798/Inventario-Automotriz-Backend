package com.nexos.mod.core.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(InventoryDetails.class)
public class Inventories_ implements Serializable {
  public static volatile SingularAttribute<Inventories, Long> autId;
  public static volatile SingularAttribute<Inventories, String> invCode;
  public static volatile SingularAttribute<Inventories, String> invDescription;
  public static volatile SingularAttribute<Inventories, Date> invDateInventory;
}
