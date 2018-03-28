
public class PizzaOrder {
	public Pizza pizza;
	public int quantity;
	
	public PizzaOrder(Pizza item, int quantity, GenerateBill bill){
		try{
			this.pizza=item;
			this.quantity=quantity;
			bill.addItem(this);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
