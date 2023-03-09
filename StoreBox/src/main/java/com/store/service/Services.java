package com.store.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.entity.ReceivedItem;
import com.store.entity.Store;
import com.store.repository.Repository;
@Service
public class Services
{
@Autowired 
Repository repository;
Logger logger = LoggerFactory.getLogger(Services.class);

public void saveReceivedItems( ReceivedItem item)
{  
	System.out.println("Saving......");
	logger.info("Passing Received items");
	repository.save(item);
}

public ResponseBody ShowInvertory()
{

	for(ReceivedItem items : repository.findAll())
	{
			System.out.println(items.toString());
	}
	return ResponseBody;
}
}
