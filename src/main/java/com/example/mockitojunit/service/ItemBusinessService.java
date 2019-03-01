package com.example.mockitojunit.service;

import org.springframework.stereotype.Component;

import com.example.mockitojunit.model.Item;

@Component
public class ItemBusinessService {

	public Item getHardcodedItem() {
		return new Item(1, "ball", 10, 100);		
	}
}
