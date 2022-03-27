enum Season { WINTER, SPRING, SUMMER, FALL }
public class en{
	
	public static void main(String[] args){
		

		System.out.println(Season.WINTER);
	}
}

class Card {
	public static final int CLUBS = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int SPADES = 3;
	private int suit;

	public void setSuit(int suit) {
		this.suit = suit;
	}
}