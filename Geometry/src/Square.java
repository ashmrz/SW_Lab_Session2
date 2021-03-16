public class Square implements GeometricShape {
	private double width;

	public Square(double width) throws Exception {
		if (width < 0){
			throw new Exception("Negative Width");
		}	
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) throws Exception {
		if (width < 0){
			throw new Exception("Negative Width");
		}
		this.width = width;
	}
	
	public double computeArea() {
		return width * width;
	}
}