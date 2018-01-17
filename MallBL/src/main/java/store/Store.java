package store;

import items.Shelf;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("Store")
public class Store implements IStore{

	
	@Autowired
	private ShoppingCart cart;
	
	@Autowired
	private Shelf s;

	@PostConstruct
	public void buy(){
		cart.buy();
		s.updateeShelf();
		System.out.println(s.displayGoods());
	}
	
	@Override
	public String toString() {
		return "Store [cart=" + cart + "]";
	}
	
	
}
