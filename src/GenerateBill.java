import java.util.LinkedList;
	public class GenerateBill {
		LinkedList<PizzaOrder> pizza_items = new LinkedList<PizzaOrder>();
		//private final float GST=12/100;
		private float total;
		//private float fianlTotal;
		public void addItem(PizzaOrder item) throws NullPointerException {
			try{
				this.pizza_items.add(item);
			}catch (NullPointerException e) {
				throw e;
			}
		}
		public void removeItem(PizzaOrder item){
			this.pizza_items.remove(item);
		}
		public void printBill(){
			try{
				System.out.println("\t\t\t=========================================");
				System.out.println("\t\t\t\t\tDomino's Pizza");
				System.out.println("\t\t\t=========================================\n");
				//System.out.println("")
				System.out.println("Type		Name				Quatity	        Price		Total");
				System.out.println("________________________________________________________________________________________");
				for(int i=0; i<pizza_items.size();i++){
					System.out.println(this.pizza_items.get(i).pizza.getPtype()+"	 	"+this.pizza_items.get(i).pizza.getName()+"		"+this.pizza_items.get(i).quantity+"		"+this.pizza_items.get(i).pizza.getPrice()+"		"+this.pizza_items.get(i).quantity*this.pizza_items.get(i).pizza.getPrice());
					this.total+=this.pizza_items.get(i).quantity*this.pizza_items.get(i).pizza.getPrice();
					
				}
				System.out.println("________________________________________________________________________________________");
				
				System.out.println("\t\t\t\t\tTotal Price\t\t\t: "+this.total+"  Rps");
				System.out.println("\t\t\t\t\tTotal Price including GST(8%)\t: "+(total+(total*8/100))+"  Rps");
				System.out.println("\n\n\t\t\t\t Thank you.. Do Visit Again");

			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("Error While Printing bill");
			}
			
		}
		
	}


