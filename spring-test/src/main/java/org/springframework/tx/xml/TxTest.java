package org.springframework.tx.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.tx.xml.service.BookService;


import java.sql.SQLException;

// 把xml配置的方式准备对象的过程画一个流程图出来
public class TxTest {
    public static void main(String[] args) throws SQLException {
        //System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"d:\\code");
        ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
        BookService bookService = context.getBean("bookSer", BookService.class);
        bookService.checkout("zhangsan",1);
    }
}
