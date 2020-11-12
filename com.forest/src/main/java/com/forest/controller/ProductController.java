package com.forest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.forest.model.Product;
import com.forest.service.ProductService;

//connect from postman as http://localhost:8082/swagger-ui.html
@Controller
@RequestMapping("/Product")
public class ProductController {
	
	Logger logger=LoggerFactory.getLogger(ProductController.class);
	@Autowired
	private ProductService productService;
	
	//creating a get mapping that retrieves the detail of a specific Product
	@GetMapping("/{productId}")
	
	public @ResponseBody Product getProductByproductId(@PathVariable Integer productId)
	{
		logger.info("product service was instalized");
		return productService.getProductByproductId(productId);
	}
	
	//creating post mapping that post the Product detail in the database
	@PostMapping("/")
	public @ResponseBody Product addProduct(@RequestBody Product Product)
	{
		return productService.addProduct(Product);
	}
	
	//creating put mapping that updates the Product detail
	@PutMapping("/{productId}")
	public @ResponseBody Product updateProduct(@RequestBody Product Product)
	{
		
		return productService.updateProduct( Product);
	}
	
	//creating a delete mapping that deletes a specified Product
	@DeleteMapping("/{productId}")
	public @ResponseBody boolean deleteProductbyproductId(@PathVariable Integer productId)
	{
		return productService.deleteProductbyproductId(productId);
	}
	
	//creating a get mapping that retrieves all the Product detail from the database
	@GetMapping("/")
	public @ResponseBody List<Product> getAllProduct()
	{
		List<Product> Productlist=productService.getAllProducts();
		return Productlist;
	}
	
}
