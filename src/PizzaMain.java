
public class PizzaMain {

	public static void main(String[] args) {
	
		GenerateBill g=new GenerateBill();
		Pizza pizza1=new Pizza("VEG","MEXICAN GREEN WAVE", 200);
		Pizza pizza2=new Pizza("VEG","CHEESE N CORN    ", 150);
		Pizza pizza3 = new Pizza("NON VEG","CHICKEN DOMINATOR", 250);
		Pizza pizza4= new Pizza("NON VEG","PERI-PERI CHICKEN", 300);
		new PizzaOrder(pizza1, 2, g);
		new PizzaOrder(pizza2, 2, g);
		new PizzaOrder(pizza3, 5, g);
		new PizzaOrder(pizza4,1, g);
		g.printBill();
	}
}