package jetapp;

public class Jet {
	private String aircraftModel;
	private float speed;
	private int range;
	private double price;

	public Jet() {
		super();
	}

	public Jet(String aircraftModel, float speed, int range, double price) {
		super();
		this.aircraftModel = aircraftModel;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getAircraftModel() {
		return aircraftModel;
	}

	public void setAircraftModel(String aircraftModel) {
		this.aircraftModel = aircraftModel;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jet [aircraftModel=");
		builder.append(aircraftModel);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}