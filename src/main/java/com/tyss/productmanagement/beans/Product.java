package com.tyss.productmanagement.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="product")
public class Product {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column(unique = true)
	private String name;
	@Column
	private String imageUrl;
	@Column
	private String details;
	@Column
	private int quantity;
	@Column
	private double price;
}
