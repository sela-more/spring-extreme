package payment;

import org.springframework.beans.factory.annotation.Autowired;

import store.IStore;
import store.Store;

public class SalesMan extends Employee{

	private int bonusSalePresentage;
	@Autowired
	private IStore store;
	
	public SalesMan(String name, Store store, int sallary, int bonus) {
		super(name, store, sallary);
		bonusSalePresentage = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "SalesMan [bonusSalePresentage=" + bonusSalePresentage + "]" + store;
	}
	
	
	
	

	
}
