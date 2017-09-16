package hansung.designpatterns.decorator.starbuzzWithSizes;



public class StarbuzzCoffee {
 
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		beverage = new Tall(beverage);
		System.out.println(beverage.getDescription() 
				+ " $" + String.format("%.2f", beverage.cost()));
		
		Beverage beverage1 = new Espresso();
		beverage1 = new Grade(beverage1);
		System.out.println(beverage1.getDescription() 
				+ " $" + String.format("%.2f", beverage1.cost()));
 
 
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Venti(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + String.format("%.2f", beverage2.cost()));
		
		Beverage beverage3 = new DarkRoast();
	
		beverage3 = new Mocha(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		beverage3 = new Venti(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + String.format("%.2f", beverage3.cost()));
 
	}
}
