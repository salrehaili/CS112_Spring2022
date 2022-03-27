
public class Product {
	private int id;
	private String category;
	private double price;
	
	public Product(int id, String category, double price) {
		this.id = id;
		this.category = category;
		this.price=price;
	}
	public int getId(){
		return this.id;
	}
	public setId(int id){
		this.id=id;
	}
	public String getCategory(){
		return this.category;
	}
	public setCategory(String category){
		this.category = category;
	}
	public String getPrice(){
		return this.price;
	}
	public setPrice(double price){
		this.price = price;
	}
}