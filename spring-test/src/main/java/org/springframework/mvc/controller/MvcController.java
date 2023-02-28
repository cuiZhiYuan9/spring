package org.springframework.mvc.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class MvcController {

	@PostMapping("/fileupload")
	public String test(){
		return "";
	}

	@RequestMapping("/param")
	public String getParam(String date, Map<String,Object> map){
		System.out.println(date);
		map.put("a",new Date());
		return "map";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder){
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		CustomDateEditor dateEditor = new CustomDateEditor(df,true);
		binder.registerCustomEditor(Date.class,dateEditor);
	}
}
