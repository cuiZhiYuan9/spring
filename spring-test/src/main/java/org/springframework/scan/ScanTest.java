package org.springframework.scan;

import org.springframework.Cao;
import org.springframework.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("org.springframework.scan.cc")
public class ScanTest {

	@Bean
	public Person person(){
		return new Person();
	}
}
