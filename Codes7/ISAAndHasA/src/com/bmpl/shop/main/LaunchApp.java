package com.bmpl.shop.main;

import com.bmpl.shop.order.Order;

public class LaunchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();
		String message = order.buyShoe();
		System.out.println(message);
		System.out.println(order.buyCloth());
	}

}
