package hansung.designpatterns.decorator.starbuzzWithSizes;

public class Tall extends CondimentDecorator {
	public Tall(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 톨 사이즈";
	}

	public double cost() {
		return beverage.cost();
	}
}
