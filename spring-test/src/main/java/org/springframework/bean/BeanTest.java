package org.springframework.bean;


import org.springframework.Cao;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanTest {


	public Cao cao(){
		return new Cao().setId("1");
	}
}
