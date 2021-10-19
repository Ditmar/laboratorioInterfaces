package shapes;

public class Rectangle {
	private Double width;
	private Double height;
	public Rectangle(Double width, Double height) {
		this.width = width;
		this.height = height;
	}
	public Double calculeArea() {
		return this.width * this.height;
	}
}
	