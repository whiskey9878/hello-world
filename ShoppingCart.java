import java.util.ArrayList;

public class ShoppingCart {
	// pri vars
	private String customerName;
	private String currentDate;
	private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();

	// constructors
	public ShoppingCart() {
		customerName = "none";
		currentDate = "Jan 1, 2016";
	}

	public ShoppingCart(String name, String date) {
		customerName = name;
		this.currentDate = date;
	}

	// methods
	public String getCustomerName() {
		return customerName;
	}

	public void addItem(ItemToPurchase item) {

		for (ItemToPurchase items : cartItems) {
			if (cartItems.contains(item)) {
				items.setQuantity(item.getQuantity() + items.getQuantity());
			} else {
				cartItems.add(items);
			}
		}
	}

	public void removeItem(String item) {

		for (ItemToPurchase items : cartItems) {
			if (cartItems.contains(item)) {
				cartItems.remove(item);
			} else {
				System.out.println("Item not found in cart. Nothing removed.");
			}
		}

	}

	public void modifyItem(ItemToPurchase item) {

		for (ItemToPurchase items : cartItems) {
			if (!cartItems.contains(item.getName())) {
				System.out.println("Item not found in cart. Nothing Modified.");
			} else if (item.getDescription() == "none") {
				System.out.println();
			}
		}
	}

}
