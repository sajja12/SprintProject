package com.forest.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.forest.model.Product;

public interface IProductService
{
	//------------------------ 1. Product Service --------------------------
			/*******************************************************************************************************
			 - Function Name	:	getProductByproductId(Integer ProductId)
			 - Input Parameters	:	Integer ProductId
			 - Return Type		:	Product
			 - Author			:	Lavanya
			 - Creation Date	:	11/11/2020
			 - Description		:	getting Product details from database calls Controller method getProductByproductId(Integer ProductId)

			 ********************************************************************************************************/
	Product getProductByproductId(Integer productId);
	
	//------------------------ 1. Product Service --------------------------
		/*******************************************************************************************************
		 - Function Name	:	addProduct(Product Product)
		 - Input Parameters	:	Product Product
		 - Return Type		:	Product
		 - Author			:	Lavanya
		 - Creation Date	:	11/11/2020
		 - Description		:	adding Product details to database calls Controller method addProduct(Product Product)
		 ********************************************************************************************************/
	Product addProduct(@RequestBody Product Product);
	
	//------------------------ 1. Product Service --------------------------
	/*******************************************************************************************************
	 - Function Name	:	UpdateProduct(Product Product)
	 - Input Parameters	:	Product Product
	 - Return Type		:	Product
	 - Author			:	Lavanya
	 - Creation Date	:	11/11/2020
	 - Description		:	updating Product details to database calls Controller method UpdateProduct(Product Product)
	 ********************************************************************************************************/
	Product updateProduct(@RequestBody Product Product);
	
	/*******************************************************************************************************
	 - Function Name	:	deleteProductbyproductId(Integer ProductId)
	 - Input Parameters	:	Integer ProductId
	 - Return Type		:	boolean
	 - Author			:	Lavanya
	 - Creation Date	:	11/11/2020
	 - Description		:	updating Product details to database calls Controller method deleteProductbyproductId(Integer ProductId)
	 ********************************************************************************************************/
	boolean deleteProductbyproductId(@PathVariable Integer productId);
	
	/*******************************************************************************************************
	 - Function Name	:	getAllProduct()
	 - Return Type		:	List<Product> 
	 - Author			:	Lavanya
	 - Creation Date	:	11/11/2020
	 - Description		:	getting Product details in database calls Controller method getAllProduct()
	 ********************************************************************************************************/
	List<Product> getAllProducts();
}
