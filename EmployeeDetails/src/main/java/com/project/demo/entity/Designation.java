package com.project.demo.entity;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor(access= AccessLevel.PUBLIC)
@NoArgsConstructor(access= AccessLevel.PUBLIC)
@EqualsAndHashCode
@Getter(value= AccessLevel.PUBLIC)
@Setter(value= AccessLevel.PUBLIC)
@Table(name="Designation")
public class Designation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotEmpty(message ="Please enter a name")
	@NotNull(message ="Please enter a name")
	private String name;
	
	
	
	//@OneToMany(mappedBy="designation")
	//private List<Employee> employee = new ArrayList<Employee>();

}
