package designPatterns;

public class AbstractCar {
	public Car getCar(String carType) {
		if (carType == null) {
			return null;
		} else if (carType == "italian") {
			return new FiatPanda("Fiat", "Panda");
		} else if (carType == "german") {
			return new VolkswagenPolo("Volswagen", "Polo");
		} else if (carType == "japanese") {
			return new ToyotaYaris("Toyota", "Yaris");
		}
		return null;
	}

}
