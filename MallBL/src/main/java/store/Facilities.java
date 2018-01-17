package store;

import org.springframework.beans.factory.annotation.Autowired;


public class Facilities {

	
	private Restroom restroom;

	
	@Autowired
	public Facilities(Restroom restroom) {
		super();
		this.restroom = restroom;
	}



	@Override
	public String toString() {
		return restroom.toString();
	}
}
