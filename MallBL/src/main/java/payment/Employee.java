package payment;

import store.Store;

public class Employee {

	private String name;
	private Store store;
	private int sallary;
	
	
	public Employee(String name, Store store, int sallary) {
		super();
		this.name = name;
		this.store = store;
		this.sallary = sallary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", store=" + store + ", sallary="
				+ sallary + "]";
	}
	
	
	
	
}
