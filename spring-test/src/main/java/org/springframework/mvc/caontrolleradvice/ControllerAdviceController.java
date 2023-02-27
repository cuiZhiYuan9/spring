package org.springframework.mvc.caontrolleradvice;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ControllerAdviceController {
	@ModelAttribute(name="md")
	public Map<String,Object> mydata(){
		HashMap<String,Object> map = new HashMap<>();
		map.put("age",99);
		map.put("gender","男");
		return map;
	}

	@InitBinder("a")
	public void a(WebDataBinder binder){
		binder.setFieldDefaultPrefix("a.");
	}

	@InitBinder("b")
	public void b(WebDataBinder binder){
		binder.setFieldDefaultPrefix("b.");
	}
}
