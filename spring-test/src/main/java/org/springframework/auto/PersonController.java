package org.springframework.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;

	@Resource
	private String id;
}
