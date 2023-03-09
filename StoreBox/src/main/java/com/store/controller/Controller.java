package com.store.controller;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.ReceivedItem;
import com.store.service.Services;



@RestController
public class Controller 
{
	@Autowired
	Services services;


	@GetMapping("/saved")
	public String saveToDataBase()
	{ 

	ReceivedItem item=new ReceivedItem();
	
	item.setItemName("Lowes");
	item.setItemNumber(2333333);
	item.setVendorsName("Makies");
	item.setRequired("true");

	services.saveReceivedItems(item);

	return "index";
	}
	@GetMapping("/showinventory")
	public void showInventory()
	{
		services.ShowInvertory();
	}
}
