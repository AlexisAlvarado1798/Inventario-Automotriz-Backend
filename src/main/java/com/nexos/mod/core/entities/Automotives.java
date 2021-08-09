package com.nexos.mod.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AUTOMOTIVES")
public class Automotives implements Serializable {
  private Long autId;
  private Long traId;
  private String autCode;
  private String autDescription;
  private Long autModel;
  private String autName;
  private Long typId;
  private TypesAutomotives typesAutomotives;

  @Id
  @Column(name = "AUT_ID")
  //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rol_id_seq")
  //@SequenceGenerator(name = "rol_id_seq")
  public Long getAutId() {
    return autId;
  }

  public void setAutId(final Long autId) {
    this.autId = autId;
  }

  @Column(name = "TRA_ID")
  public Long getTraId() {
    return traId;
  }

  public void setTraId(final Long traId) {
    this.traId = traId;
  }

  @Column(name = "AUT_CODE")
  public String getAutCode() {
    return autCode;
  }

  public void setAutCode(final String autCode) {
    this.autCode = autCode;
  }

  @Column(name = "AUT_DESCRIPTION")
  public String getAutDescription() {
    return autDescription;
  }

  public void setAutDescription(final String autDescription) {
    this.autDescription = autDescription;
  }

  @Column(name = "AUT_MODEL")
  public Long getAutModel() {
    return autModel;
  }

  public void setAutModel(final Long autModel) {
    this.autModel = autModel;
  }

  @Column(name = "AUT_NAME")
  public String getAutName() {
    return autName;
  }

  public void setAutName(final String autName) {
    this.autName = autName;
  }

  @Column(name = "TYP_ID")
  public Long getTypId() {
    return typId;
  }

  public void setTypId(final Long typId) {
    this.typId = typId;
  }

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "TYP_ID", updatable = false, insertable = false)
  public TypesAutomotives getTypesAutomotives() {
    return typesAutomotives;
  }

  public void setTypesAutomotives(final TypesAutomotives typesAutomotives) {
    this.typesAutomotives = typesAutomotives;
  }
}
