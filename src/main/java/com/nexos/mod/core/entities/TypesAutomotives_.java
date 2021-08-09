package com.nexos.mod.core.entities;

import java.io.Serializable;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TypesAutomotives.class)
public class TypesAutomotives_ implements Serializable {
  public static volatile SingularAttribute<TypesAutomotives, Long> typId;
  public static volatile SingularAttribute<TypesAutomotives, String> typCode;
  public static volatile SingularAttribute<TypesAutomotives, String> typDescription;
}
