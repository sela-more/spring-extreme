package store;

import items.Gadget;
import items.Item;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("items")
public class ShoppingCart {

	@Autowired
	Set<Item> item;
	
	@Autowired
	ApplicationContext context;
 
	@Autowired
	@Qualifier("Book")
	Item i;
	
	@Autowired
	//@Qualifier("Smartphone")
	Gadget[] g;
	
	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]" + g;
	}
	
	public void buy(){
		System.out.println(context.getBean("Goodies", "Bottle"));
		System.out.println(context.getBean("Goodies", "Mouse"));
	}
}
