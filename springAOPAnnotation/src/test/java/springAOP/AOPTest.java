package springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dzkj.biz.UsersBiz;

public class AOPTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UsersBiz biz = ac.getBean(UsersBiz.class);
		biz.findAll();
	}
}
