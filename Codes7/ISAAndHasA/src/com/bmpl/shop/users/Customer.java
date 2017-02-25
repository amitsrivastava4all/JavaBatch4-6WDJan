package com.bmpl.shop.users;

import com.bmpl.shop.products.Cloth;
import com.bmpl.shop.products.Shoe;

public class Customer {
	private Shoe shoe;
	private int id;
	private String name;
	private Cloth cloth;
	
	public Cloth getCloth() {
		return cloth;
	}
	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}
	public Customer(int id , String name){
		this.id  = id;
		this.name =name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Shoe getShoe() {
		return shoe;
	}
	public void setShoe(Shoe shoe) {
		this.shoe = shoe;
	}
	
	

}
