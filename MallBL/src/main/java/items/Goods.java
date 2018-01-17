package items;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Goodies")
@Scope("prototype")
public class Goods {
	private String productName;
	
	public Goods(String name) {
		productName = name;
	}
	
	public Goods() {
		productName = "baloon";
	}

	@Override
	public String toString() {
		return "Goods [productName=" + productName + "]";
	}
	
	
}
