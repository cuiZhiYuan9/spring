package org.springframework.scan;

import org.springframework.Cao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("org.springframework.scan.cc")
public class ScanTest {

//	@Bean
//	public Cao show(){
//		return new Cao().setId("1");
//	}
}
