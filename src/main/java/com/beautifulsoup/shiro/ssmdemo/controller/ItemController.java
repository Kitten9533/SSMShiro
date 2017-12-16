package com.beautifulsoup.shiro.ssmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/item")
@Controller
public class ItemController {
	
	@RequestMapping("/delete02")
	public String itemDelete(){
		
		
		return "delete02item";
	}
	
	@RequestMapping("/query")
	public String ItemQuery(){
		return "itemquery";
	}
}
