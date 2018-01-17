package items;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Gadget {

	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gadget() {
		// TODO Auto-generated constructor stub
	}
	
	public Gadget(String n){
		name = n;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
