package com.ccsp.entity;
// default package
// Generated 14 Mar, 2017 8:35:50 PM by Hibernate Tools 5.0.2.Final


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Procedures generated by hbm2java
 */
@Entity
@Table(name = "procedures")
public class Procedures implements java.io.Serializable {


  private int id;
  private Integer procCode;
  private String procName;
  private Integer diagCode;

  public Procedures() {}


  public Procedures(int id) {
    this.id = id;
  }

  public Procedures(int id, Integer procCode, String procName, Integer diagCode) {
    this.id = id;
    this.procCode = procCode;
    this.procName = procName;
    this.diagCode = diagCode;
  }

  @Id


  @Column(name = "id", unique = true, nullable = false)
  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }


  @Column(name = "proc_code")
  public Integer getProcCode() {
    return this.procCode;
  }

  public void setProcCode(Integer procCode) {
    this.procCode = procCode;
  }


  @Column(name = "proc_name", length = 50)
  public String getProcName() {
    return this.procName;
  }

  public void setProcName(String procName) {
    this.procName = procName;
  }


  @Column(name = "diag_code")
  public Integer getDiagCode() {
    return this.diagCode;
  }

  public void setDiagCode(Integer diagCode) {
    this.diagCode = diagCode;
  }



}

