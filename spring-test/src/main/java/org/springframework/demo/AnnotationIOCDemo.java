package org.springframework.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.serivce.IOCService;

public class AnnotationIOCDemo {
	public static void main (String args[]){
		ApplicationContext context = new AnnotationConfigApplicationContext("org.springframework.anno");
		IOCService iocService=context.getBean(IOCService.class);
		System.out.println(iocService);
	}
}
