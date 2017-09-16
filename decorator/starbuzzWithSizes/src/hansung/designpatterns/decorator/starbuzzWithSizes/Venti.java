package hansung.designpatterns.decorator.starbuzzWithSizes;

public class Venti extends CondimentDecorator {
	public Venti(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 벤티 사이즈";
	}

	public double cost() {
		return beverage.cost()*3;
	}
}
