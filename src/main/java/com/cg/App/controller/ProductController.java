package com.cg.App.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.App.model.Product;
import com.cg.App.service.ProductService;


//@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")

@RestController
public class ProductController {
	private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);
@Autowired
ProductService productService;

//get list of all, medicine
@GetMapping("/getallProducts") // Endpoints

public List<Product> getAllProducts() {
	LOG.info("getAllProduct");
		return productService.getAllProduct();
}

//add medicine to database
@PostMapping("/AddProduct")
public Product addProduct(@RequestBody Product product) {
	LOG.info("Add Product");
	return productService.addMedicine(product);
}

}
