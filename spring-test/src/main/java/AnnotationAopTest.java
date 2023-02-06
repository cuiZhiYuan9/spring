import org.springframework.aop.service.MyCalculator;
import org.springframework.aop.service.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationAopTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		MyCalculator bean = annotationConfigApplicationContext.getBean(MyCalculator.class);
		bean.add(1, 4);
	}
}
