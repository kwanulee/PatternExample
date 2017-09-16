package hansung.designpatterns.decorator.starbuzzWithSizes;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "하우스 블렌드";
	}
 
	public double cost() {
		return .89;
	}
}

