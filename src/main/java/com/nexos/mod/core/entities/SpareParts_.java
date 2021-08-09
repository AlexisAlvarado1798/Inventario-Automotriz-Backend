package com.nexos.mod.core.entities;

import java.io.Serializable;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(SpareParts.class)
public class SpareParts_ implements Serializable {
  public static volatile SingularAttribute<SpareParts, Long> spaId;
  public static volatile SingularAttribute<SpareParts, Long> traId;
  public static volatile SingularAttribute<SpareParts, String> spaCode;
  public static volatile SingularAttribute<SpareParts, String> spaDescription;
  public static volatile SingularAttribute<SpareParts, String> spaName;
  public static volatile SingularAttribute<SpareParts, Long> typId;


}
