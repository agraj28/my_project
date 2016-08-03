package com.niit.Insbackend;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.insbackend.doa.ProductsDao;
import com.niit.insbackend.model.Products;

public class Productstest {
public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.insbackend");
		context.refresh();
		
		
	   ProductsDao productsdao = 	(ProductsDao) context.getBean("productsdao");
	   
	   Products products = 	(Products) context.getBean("products");
	   products.setP_id("Pr001");
	   products.setP_name("C++");
	   products.setP_desc("Basic programming language");
	   
	   
	  productsdao.saveorupdate(products);
	   
	   
	   
	   
/*  if(   productsdao.get("CG12") ==null)
	  {
		  System.out.println("Product does not exist");
		  }
	  else
	  {
		  System.out.println("Product exist .. the details are ..");
		  System.out.println();
	  }
			
		*/
	}
}
