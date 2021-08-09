package com.nexos.mod.core.entities;

import java.io.Serializable;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(InventoryDetails.class)
public class InventoryDetails_ implements Serializable {
  public static volatile SingularAttribute<InventoryDetails, Long> detId;
  public static volatile SingularAttribute<InventoryDetails, Long> invId;
  public static volatile SingularAttribute<InventoryDetails, Long> spaId;
  public static volatile SingularAttribute<InventoryDetails, Long> autId;
  public static volatile SingularAttribute<InventoryDetails, Integer> detStock;
  public static volatile SingularAttribute<InventoryDetails, Integer> detInitialStock;
  public static volatile SingularAttribute<InventoryDetails, Long> detPrice;
  public static volatile SingularAttribute<InventoryDetails, Inventories> inventories;
  public static volatile SingularAttribute<InventoryDetails, SpareParts> spareParts;

}
