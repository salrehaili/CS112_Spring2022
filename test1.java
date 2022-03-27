import java.util.Date;
class car{
	public int a=1;
	private int b;
	int c;
	public static int v =1;

	car(){

	}
	car(int a, int b){
		this.a=a;
		this.b=b;

	}
	public void setb(int nb){

	}
}


class test1{
	
	public static void main(String[] args){
		car c1 = new car();
		car c2 = new car();

		c1.a=9;
		//c1.b=7;
		c1.setb(7);
		c1.c=8;	
		System.out.println(c1.v);
		System.out.println(c2.v);
		System.out.println(car.v);

		Date d=new Date();
		System.out.println(d);

	}
}