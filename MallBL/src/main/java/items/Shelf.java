package items;



public abstract class Shelf {

	Goods g;
	protected abstract Goods createGoodies();
	
	public void updateeShelf(){
		g = createGoodies();
	}
	
	public Goods displayGoods(){
		return g;
	}
}
