package com.cg.App.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data

@AllArgsConstructor

@NoArgsConstructor

@Table(name = "ADMIN")

public class Admin {
@Id

@GeneratedValue(strategy=GenerationType.AUTO)

private Integer aId;

@Column(name="ADMIN_NAME")

private String aName;
@Column(name="USERNAME")

private String userName;

@Column(name="PASSWORD") 
private String password;
}
