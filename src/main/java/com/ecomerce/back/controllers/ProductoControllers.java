package com.ecomerce.back.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecomerce.back.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductoControllers {
	

	private ProductService productService;
	
	@GetMapping("")
	public String show(Model model) {
		model.addAttribute("products", productService.findAll());
		return "products/show";
		
		
	}
	
	@GetMapping("/create")
	public String create() {
		return "products/create";
	}
		
	

}
