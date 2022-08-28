class Bike {//prent class
	int speedLimit = 60;

	void run() {//static
		System.out.println("running with 60 km");
	}

	void stop() {
		System.out.println("stop");

	}

	int speedLimit() {
		return speedLimit;
	}
}

class Splender extends Bike {
	int speedLimit = 90;

	void run() {//static then output will be from bike class it will not overridden
		System.out.println("running with 90 km");

	}

	int speedLimit() {
		return speedLimit;
	}
}

public class stat1 {
	public static void main(String args[]) {
		Bike b = new Splender();
		b.run();// 90//splender
		b.stop();// stop//bike
		System.out.println(b.speedLimit);// 60//bike
		System.out.println(b.speedLimit());// 90 fun will run (ovr ridden)

	}

}
