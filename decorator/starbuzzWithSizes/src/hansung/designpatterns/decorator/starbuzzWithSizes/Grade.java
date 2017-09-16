package hansung.designpatterns.decorator.starbuzzWithSizes;

public class Grade extends CondimentDecorator {
	public Grade(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", 그랑데 사이즈";
	}

	public double cost() {
		return beverage.cost()*2;
	}
}
