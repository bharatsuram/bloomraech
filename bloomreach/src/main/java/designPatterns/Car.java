package designPatterns;

public abstract class Car {

	String make;
	String model;

	protected Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}

class VolkswagenPolo extends Car {
	public VolkswagenPolo(String make, String model) {
		super(make, model);
	}
}

class FiatPanda extends Car {
	public FiatPanda(String make, String model) {
		super(make, model);
	}
}

class ToyotaYaris extends Car {
	public ToyotaYaris(String make, String model) {
		super(make, model);
	}
}
