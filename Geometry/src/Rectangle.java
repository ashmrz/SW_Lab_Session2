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
	
	public void setHeight(double height) throws Exception{
		if (height < 0){
			throw new Exepction("Neagtive Height");
		}
		this.height = height;
	}
	
	public getHeight(){
		return height;
	}
	
	public void setWidth(double width) throws Exception{
		if (width < 0){
			throw new Exepction("Neagtive Width");
		}
		this.width = width;
	}
	
	public getWidth(){
		return width;
	}

	public double computeArea() {
		return width * height;
	}
}