package question_number_3;
public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1111",11);
		Item item2 = new Item("2222",22);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by CreditCard
		// public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate, String id)
		cart.pay(new CreditCardStrategy("sagi", "5426762217661234", "222", "6/4/28", "209351147"));
		
		ShoppingCart cart2 = new ShoppingCart();
		Item item3 = new Item("3333",33);
		Item item4 = new Item("4444",44);
		
		cart2.addItem(item3);
		cart2.addItem(item4);
		
		//pay by credit card
		cart2.pay(new GiftCardStrategy("sagi ben shushan", "22522422689716661", "6/28"));
		cart.printOrders();
		cart2.printOrders();
	}
}
