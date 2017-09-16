package hansung.designpatterns.decorator.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
}
