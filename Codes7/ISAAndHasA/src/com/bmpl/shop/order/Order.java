package com.bmpl.shop.order;

import com.bmpl.shop.products.Cloth;
import com.bmpl.shop.products.Shoe;
import com.bmpl.shop.users.Customer;

public class Order {
	
	public String buyShoe(){
		Customer customer = new Customer(1001,"Ram");
		Shoe shoe = new Shoe();
		shoe.setId( 1001);
		shoe.setName("Puma");
		shoe.setPrice(2000.00);
		shoe.setDiscount(10);
		customer.setShoe(shoe);
		return "Thanks "+customer.getName() 
		+" for Buying "+shoe.getName();
		
	}
	
	public String buyCloth(){
		Customer customer = new Customer(1001,"Ram");
		Cloth cloth = new Cloth();
		cloth.setId(1002);
		cloth.setName("Shirt");
		cloth.setPrice(999);
		customer.setCloth(cloth);
		return "Thanks "+customer.getName()+" For Buying "+cloth.getName();
		
	}

}
