package com.springrest.springrest.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Entities.Recipie;
import com.springrest.springrest.services.RecipiesService;


@RestController
public class MyController {
	
	@Autowired
	private RecipiesService recipieService;
	
	@GetMapping("/home")
	public String home() {
		return "This is homepage";
	}

	//get the recipes
	
	@GetMapping("/Recipies")
	public List<Recipie> getRecipies()
	{
		 
		return this.recipieService.getRecipies();
	}
}
