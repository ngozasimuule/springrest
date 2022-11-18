package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.Entities.Recipie;

@Service
public class RecipiesServiceimpl implements RecipiesService {

	List<Recipie> list;
	
	public RecipiesServiceimpl()
	{
		list = new ArrayList<>();
		list.add(new Recipie(1, "Mustard Champ", "Ingredients:Mustard, Onion, Oil, Salt, Green Chillies, Coriander leaves, Turmeric"));
		list.add(new Recipie(2, "Chicken masala", "Ingredients:Chicken, Mustard, Onion, Oil, Salt, Green Chillies, Coriander leaves, Turmeric"));
		list.add(new Recipie(3, "Masala Mushroom", "Ingredients:Mushroom, Onion, Oil, Salt, Green Chillies, Turmeric"));
		
	}
	
	
	
	@Override
	public List<Recipie> getRecipies() {
		return list;
	}

}
