package com.outdd.awmapicustomer.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Entity implementation class for Entity: Operation
 *
 */
@Table(name="sys_operation")
@Entity
public class Operation implements Serializable {

	
	private int id;
	private String desc;
	private String name;
	private String operation;
	private static final long serialVersionUID = 1L;

	public Operation() {
		super();
	}   
	
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	
	@Column(unique=true)
	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
   
}
