package com.nexos.mod.core.entities;

import java.io.Serializable;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Automotives.class)
public class Automotives_ implements Serializable {
  public static volatile SingularAttribute<Automotives, Long> autId;
  public static volatile SingularAttribute<Automotives, Long> traId;
  public static volatile SingularAttribute<Automotives, String> autCode;
  public static volatile SingularAttribute<Automotives, String> autDescription;
  public static volatile SingularAttribute<Automotives, Long> autModel;
  public static volatile SingularAttribute<Automotives, String> autName;
  public static volatile SingularAttribute<Automotives, Long> typId;
  public static volatile SingularAttribute<Automotives, TypesAutomotives> typAut;

}