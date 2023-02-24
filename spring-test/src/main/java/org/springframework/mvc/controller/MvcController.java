package org.springframework.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MvcController {

	@PostMapping("/fileupload")
	public String test(){
		return "";
	}
}
