package store;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyClassPathApplicationContext extends ClassPathXmlApplicationContext{

	public MyClassPathApplicationContext(String string) {
		super(string);
	}

	@Override
	public void doClose() {
		System.out.println("closing the container");
	}
}
