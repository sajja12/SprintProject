package com.forest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.forest.model.Contract;

public interface IContractController 
{
	//------------------------ 1. Contract Application --------------------------
	/**************************************************************************************************************
				 -Function Name	:	getContractBycontractNumber(Integer contractNumber)
				 - Input Parameters	:   Integer contractNumber
				 - Return Type		:	Contract
				 - Author			:	Lavanya
				 - Creation Date	:	10/11/2020
				 -Description		:	getting contract details from the database 
	 ********************************************************************************************************/
	public @ResponseBody Contract getContractBycontractNumber(@PathVariable Integer contractNumber);
	
	//------------------------ 1. Contract Application --------------------------
	/*******************************************************************************************************
	 - Function Name	:	addContract(Contract contract)
	 - Input Parameters	:	Contract contract
	 - Return Type		:	Contract
	 - Author			:	Lavanya
	 - Creation Date	:	10/11/2020
	 - Description		:	Adding contract details into the database
	 ********************************************************************************************************/
	public @ResponseBody Contract addContract(@RequestBody Contract Contract);
	
	//------------------------ 1. Contract Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	UpdateContract(Contract contract)
			 - Input Parameters	:	Contract contract
			 - Return Type		:	Contract
			 - Author			:	Lavanya
			 - Creation Date	:	10/11/2020
			 - Description		:	updating the contract details
			 ********************************************************************************************************/
	public @ResponseBody Contract updateContract(@RequestBody Contract Contract);
	
	//------------------------ 1. Contract Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	deleteProduct(String contractNumber) 
			 - Input Parameters	:	String contractNumber
			 - Return Type		:	boolean
			 - Author			:	Lavanya
			 - Creation Date	:	10/11/2020
			 - Description		:	deleting contract details
			 ********************************************************************************************************/
	public @ResponseBody boolean deleteContractbycontractNumber(@PathVariable Integer contractNumber);
	
	//------------------------ 1. Contract Application --------------------------
			/*******************************************************************************************************
			 - Function Name	:	getAllContract() 
			 - Input Parameters	:	No
			 - Return Type		:	List<contract>
			 - Author			:	Lavanya
			 - Creation Date	:	10/11/2020
			 - Description		:	Getting all the contracts present in the database
			 ********************************************************************************************************/
	public @ResponseBody List<Contract> getAllContract();
	
}
