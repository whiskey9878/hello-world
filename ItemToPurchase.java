
public class ItemToPurchase {

	private String itemDescription = "none";
	private String itemName = "none";
	private int itemPrice = 0;
	private int itemQuantity = 0;
	
	public ItemToPurchase() {
		itemDescription = "none";
		itemName = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}

	public ItemToPurchase(String name, String descrip, int price, int quantity) {
		this.setName(name);
		this.setDescription(descrip);
		this.setPrice(price);
		this.setQuantity(quantity);
	}

	public String getDescription() {
		return itemDescription;
	}

	public void setDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getName() {
		return itemName;
	}

	public void setName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return itemPrice;
	}

	public void setPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return itemQuantity;
	}

	public void setQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public void printItemCost() {
		System.out.println(this.getName() + " " + this.getQuantity() + " @ $" + this.getPrice() + " = $" + (this.getPrice()*this.getQuantity()));
	}

	public void printItemDescriptor() {
		System.out.println(this.getName() + ": " + this.getDescription());
	}

}
