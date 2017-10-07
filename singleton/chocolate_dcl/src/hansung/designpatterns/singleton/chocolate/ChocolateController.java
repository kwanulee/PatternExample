package hansung.designpatterns.singleton.chocolate;
 
public class ChocolateController {
	public static void main(String args[]) {
		Thread thread1 = new Thread() {
			public void run() {
				ChocolateBoiler boiler = ChocolateBoiler.getInstance();
				boiler.fill();
				boiler.boil();
				boiler.drain();
			}
		};

		

		// will return the existing instance
		Thread thread2 = new Thread() {
			public void run() {
				ChocolateBoiler boiler = ChocolateBoiler.getInstance();
				boiler.fill();
				boiler.boil();
				boiler.drain();
			}
		};
		
		thread1.start();
		thread2.start();
	}
}
