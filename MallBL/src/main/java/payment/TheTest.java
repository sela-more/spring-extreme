package payment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="beans.xml")
@ActiveProfiles(profiles = "dev")
public class TheTest {


	@Autowired
	ApplicationContext applicationContext;
	
	@Test
	public void testToString() {
		//applicationContext.getEnvironment().acceptsProfiles("Dev");
		SalesMan man = (SalesMan) applicationContext.getBean("SalesMan");
		System.out.println(man);
	}

}
