package com.example.mockitojunit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mockitojunit.model.Item;
import com.example.mockitojunit.service.ItemBusinessService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemBusinessService businessService;
	
	@GetMapping("/item-from-service")
	public Item itemFromBusinessService() {

		return businessService.getHardcodedItem();
		
		
	}


}
