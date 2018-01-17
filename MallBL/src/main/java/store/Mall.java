package store;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import payment.Employee;


public class Mall {

	
	
	public static void main(String[] args) {
		Mall m = new Mall();
		m.goToShop("Store");
	}

	private void goToShop(String string) {
		AbstractApplicationContext context = new MyClassPathApplicationContext("beans.xml");
		context.registerShutdownHook();
		//context.close();
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Store s = (Store) context.getBean(string);
		System.out.println(s);
		s.buy();
		System.out.println(s);
		Facilities f = (Facilities) context.getBean("Facilities");
		System.out.println("facility is " + f);
		Employee e = (Employee)context.getBean("SalesMan");
		System.out.println(e);
		//s.buy();
		
	}
}
