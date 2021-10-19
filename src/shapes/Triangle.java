package shapes;

public class Triangle {
	private Double base;
	private Double height;
	public Triangle(Double base, Double height) {
		this.base = base;
		this.height = height;
	}
	public Double calculeArea() {
		return this.base * this.height;
	}
	
}
