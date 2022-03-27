class GeometricObject{
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject(){
		this.color = "white";
		this.filled=false;
		this.dateCreated = new java.util.Date();
	}
	public GeometricObject(String color, boolean filled){
		this.color = color;
		this.filled = filled;
		this.dateCreated = new java.util.Date();
	}

	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
	public boolean isFilled(){
		return this.filled;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	public java.util.Date getDate(){
		return this.dateCreated;
	}
	public String toString(){
		return " Color is :" + color  + "\n Is it filled ?" + filled + "\n date:" + dateCreated;
	}
}