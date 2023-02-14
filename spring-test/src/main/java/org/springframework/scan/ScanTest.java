package org.springframework.scan;

import org.springframework.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("org.springframework.scan.cc")
@PropertySource("classpath:dbconfig.properties")
public class ScanTest {

	@Bean
	public Person person(@Value("jdbc.driverClassName")String name){
		Person person = new Person();
		person.setId(name);
		return person;
	}
}
