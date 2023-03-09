package com.store.audit;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class Audit
{
	String required;

	@RequestMapping("/")
public String auditRequired(int itemAmount)
{
	if(itemAmount>5)
	
		required=" true";
	else
	required= "false";
	
	return required;
		
}
}
