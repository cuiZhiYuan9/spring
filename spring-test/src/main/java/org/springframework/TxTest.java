package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transactionalaop.BookService;

public class TxTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tx.xml");
		BookService bean = applicationContext.getBean(BookService.class);
		bean.checkout("李四",1);
	}
}
