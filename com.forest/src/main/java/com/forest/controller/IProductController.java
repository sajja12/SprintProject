package com.forest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.forest.model.Product;

public interface IProductController {

	//------------------------ 1. Product Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	getProductByproductId(Integer productId);
		 - Input Parameters	:	Integer productId
		 - Return Type		:	Product
		 - Author			:	Lavanya
		 - Creation Date	:	10/11/2020
		 - Description		:	getting Products details from the database
		 ********************************************************************************************************/
	public @ResponseBody Product getProductByproductId(@PathVariable Integer productId);
	
	//------------------------ 1. Product Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	addProduct(Product product) 
	 - Input Parameters	:	Product product
	 - Return Type		:	Product
	 - Author			:	Lavanya
	 - Creation Date	:	10/11/2020
	 - Description		:	Adding Products into the database
	 ********************************************************************************************************/
	public @ResponseBody Product addProduct(@RequestBody Product Product);
	//------------------------ 1. Product Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	UpdateProduct(Product product) 
	 - Input Parameters	:	Product product
	 - Return Type		:	boolean
	 - Author			:	Lavanya
	 - Creation Date	:	10/11/2020
	 - Description		:	updating the Products details
	 ********************************************************************************************************/
	
	public @ResponseBody Product updateProduct(@RequestBody Product Product);
	
	//------------------------ 1. Product Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	deleteProductbyproductId(String productId) 
		 - Input Parameters	:	String productId
		 - Return Type		:	boolean
		 - Author			:	Lavanya
		 - Creation Date	:	10/11/2020
		 - Description		:	deleting Products
		 ********************************************************************************************************/
	public @ResponseBody boolean deleteProductbyproductId(@PathVariable Integer productId);
	
	//------------------------ 1. Product Application --------------------------
		/*******************************************************************************************************
		 - Function Name	:	getAllProduct() 
		 - Input Parameters	:	No
		 - Return Type		:	List<Product>
		 - Author			:	Lavanya
		 - Creation Date	:	10/11/2020
		 - Description		:	Getting all the Products present in the database
		 ********************************************************************************************************/
	public @ResponseBody List<Product> getAllProduct();
}
