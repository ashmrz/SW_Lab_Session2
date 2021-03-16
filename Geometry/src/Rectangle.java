public class Rectangle {
	private double width;
	private double height;

	public Rectangle(double width, double height) throws Exception {
		if (width < 0 || height < 0) {
			throw new Exception("Neagtive Width or Height");
		}
		this.width = width;
		this.height = height;
	}

	public double computeArea() {
		return width * height;
	}
}