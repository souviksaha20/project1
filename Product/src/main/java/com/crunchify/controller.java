package com.crunchify;

import java.util.ArrayList;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.khozemaProducts.models.Category;
import com.khozemaProducts.models.Product;

@Controller

class controller 
{	
	
	@RequestMapping("/")
	public ModelAndView index2() {
		return new ModelAndView("index").addObject("viewName","index");
		
	}
	
	@RequestMapping(value = "/index")
	public ModelAndView index() {
		return new ModelAndView("index").addObject("viewName","index");
		
	}
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		return new ModelAndView("contact").addObject("viewName","contact");
		
	}
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		return new ModelAndView("about").addObject("viewName","about");
		
	}

	@RequestMapping(value = "/login")
	public ModelAndView login() {
		return new ModelAndView("login").addObject("viewName","login");
		
	}	

	@RequestMapping(value = "/register")
	public ModelAndView register() {
		return new ModelAndView("register").addObject("viewName","register");
		
	}
	
	
	@RequestMapping(value="/list/{brand}")
	public ModelAndView listProducts(@PathVariable Map<String,String> pathVars) {
		ModelAndView modelAndView = new ModelAndView("listProducts");
		String brand = pathVars.get("brand");
		Category category = new Category(brand);
		category.setName(brand.toUpperCase());
		category.setProducts(getProducts(brand));
		modelAndView.addObject("category", category);
		modelAndView.addObject("viewName", "list");
		return modelAndView;		
	}
	
	@RequestMapping(value="/category/{brand}")
	public ModelAndView categories(@PathVariable Map<String,String> pathVars) {
		ModelAndView modelAndView = new ModelAndView("categories");
		String brand = pathVars.get("brand");
		Category category = null;
		if(brand.equals("tv")) {			
			category = new Category("tv");
			category.getSubCategories().add("sony");
			category.getSubCategories().add("samson");
			category.getSubCategories().add("lg");
			category.getSubCategories().add("par");
			category.getSubCategories().add("mav");
		}
		else if(brand.equals("computer")) {
			category = new Category("computer");
			category.getSubCategories().add("hp");
			category.getSubCategories().add("srs");
			category.getSubCategories().add("dell");
		}
		else if(brand.equals("phone")) {
			category = new Category("phone");
			category.getSubCategories().add("sony");
			category.getSubCategories().add("nokia");
			category.getSubCategories().add("Apple");			
		}
		else {
			modelAndView.setViewName("index");
			return modelAndView;
		}
		category.setProducts(getProducts(brand));
		modelAndView.addObject("category", category);
		
		return modelAndView;
	}
	private ArrayList<Product> getProducts(String name) {
		
		ArrayList<Product> products = new ArrayList<Product>();
		if(name.equals("phone")) {
			products.add(new Product("iPhone 5s", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 19.5, 20, "images/product_one_feature.jpg"));
			products.add(new Product("iPod 4 Generation", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 29.5, 10, "images/product_two_feature.jpg"));
			products.add(new Product("Macbook Pro", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 39.5, 100, "images/product_three_feature.jpg"));			
		}		
		else if(name.equals("computer")) {
			products.add(new Product("Tab 3", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 19.5, 3, "images/product_one_feature.jpg"));
			products.add(new Product("Samsung Galaxy S4", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 29.5, 34, "images/product_two_feature.jpg"));
			products.add(new Product("Samsung Plasma", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 39.5, 10, "images/product_three_feature.jpg"));						
		}		
		else if(name.equals("tv")) {
			products.add(new Product("Lumia", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 19.5, 22, "images/product_one_feature.jpg"));
			products.add(new Product("Surface", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 29.5, 12, "images/product_two_feature.jpg"));
			products.add(new Product("Microsoft Office 10", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 39.5, 45, "images/product_three_feature.jpg"));								
		}
		else {
			products.add(new Product("iPhone 5s", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 19.5, 20, "images/product_one_feature.jpg"));
			products.add(new Product("iPod 4 Generation", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 29.5, 10, "images/product_two_feature.jpg"));
			products.add(new Product("Macbook Pro", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 39.5, 100, "images/product_three_feature.jpg"));			
			products.add(new Product("Tab 3", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 19.5, 3, "images/product_one_feature.jpg"));
			products.add(new Product("Samsung Galaxy S4", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 29.5, 34, "images/product_two_feature.jpg"));
			products.add(new Product("Samsung Plasma", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 39.5, 10, "images/product_three_feature.jpg"));						
			products.add(new Product("Lumia", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 19.5, 22, "images/product_one_feature.jpg"));
			products.add(new Product("Surface", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 29.5, 12, "images/product_two_feature.jpg"));
			products.add(new Product("Microsoft Office 10", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Porro, rem.", 39.5, 45, "images/product_three_feature.jpg"));								
		}
		
		return products;
		
	}

	
	

}




 