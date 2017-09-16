package hansung.designpatterns.decorator.starbuzzWithSizes;

public abstract class Beverage {

	String description = "Unknown Beverage";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
