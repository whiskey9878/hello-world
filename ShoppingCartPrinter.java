import java.util.Scanner;

public class ShoppingCartPrinter {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		ItemToPurchase p1 = new ItemToPurchase();
		ItemToPurchase p2 = new ItemToPurchase();
		
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		p1.setName(String.valueOf(scnr.nextLine()));
		System.out.println("Enter the item price:");
		p1.setPrice(Integer.parseInt(scnr.nextLine()));
		System.out.println("Enter the item quantity:");
		p1.setQuantity(Integer.parseInt(scnr.nextLine()));
		System.out.println();
		
		System.out.println("Item 2");
		System.out.println("Enter the item name:");
		p2.setName(String.valueOf(scnr.nextLine()));
		System.out.println("Enter the item price:");
		p2.setPrice(Integer.parseInt(scnr.nextLine()));
		System.out.println("Enter the item quantity:");
		p2.setQuantity(Integer.parseInt(scnr.nextLine()));
		System.out.println();
		
		System.out.println("TOTAL COST");
		System.out.println(p1.getName() + " " + p1.getQuantity() + " @ " + "$" + p1.getPrice() + " = $" + (p1.getPrice()*p1.getQuantity()));
		System.out.println(p2.getName() + " " + p2.getQuantity() + " @ " + "$" + p2.getPrice() + " = $" + (p2.getPrice()*p2.getQuantity()));
		System.out.println();
		
		System.out.println("Total: $" + (((p1.getPrice()*p1.getQuantity()))+(p2.getPrice()*p2.getQuantity())));
	}

}
