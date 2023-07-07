package com.example.product;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class maincontroller {
	
	@GetMapping ("/products")
	public List<product> getLocations() {
		List<product> retailProduct = new ArrayList<>();
		
		product p1= new product("Product 900","Air Jordan 1",1985,165);
		product p2= new product("Product 901","Air Force 1",1982,145);
		product p3= new product("Product 902","Air Max 1",1987,225);
		
		retailProduct.add(p1);
		retailProduct.add(p2);
		retailProduct.add(p3);
		
		return retailProduct;
	
	}
		
}
