package shapes;

public class Circle {
	private Double radio;
	public Circle (Double radio) {
		this.radio = radio;
	}
	public Double calculeArea() {
		return this.radio * Math.pow(Math.PI, 2);
	}
}
