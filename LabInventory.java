import java.util.Scanner;

/**
 * 
 */

/**
 * @author avneesh
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myinput = new Scanner(System.in);
		int count = 1;
		String password = "DitProg123";
		String update = null;
		int fail = 0;
		
		/**
		 * display menu 
		 */
		
		if(count == 1){
			
			System.out.print("What do you want to do?");
			System.out.println(" ");
			System.out.println("	1. Enter a new item to inventory(password required)");
			System.out.println("	2. Change information of an existing item(password required)");
			System.out.println("	3. Display all the items with the specifies category");
			System.out.println("	4. Display all items to be re-ordered");
			System.out.println("	5. Number of items currently in store");
			System.out.println("	6. Quit");
			System.out.print("Please enter your choice > ");
			 
			int choice = myinput.nextInt();
			
			if(choice == 1) {
				System.out.print("enter password: ");
				password = myinput.next();
				
				while (password != "DitProg123"){
					while (fail < 3 ) {
				
						System.out.print("Wrong PASSWORD! Please enter correct PASSWORD:");
						password = myinput.next();
						
						fail = fail + 1;
						
						if(fail == 4) {
							System.out.print("Program detected suspicious activity and is terminating!");
						}
					}
				}
				
			        System.out.print("How many items you want to enter?");
				qty = myinput.nextInt();
				
				for(int i =0; i<=qty; i++) {
					System.out.print("Item ID: ");
					ItemID = myinput.next();
					
					System.out.print("Name: ");
					ItemName = myinput.next();
					
					System.out.print("Description: ");
					Description = myinput.next();
					
					System.out.print("Category: ");
					category = myinput.next();
					
					System.out.print("Supplier name: ");
					supplierName = myinput.next();
					
					System.out.print("Supplier contact: ");
					SupplierContact = myinput.nextInt();
					
					System.out.print("Price: ");
					price = myinput.nextInt();
					
					System.out.print("Available qty: ");
					availableQuantity = myinput.nextInt();
					
					itemDatabase[i]= new Item(ItemID, ItemName, Description, category, supplierName, SupplierContact, price, availableQuantity);
					itemDatabase[i].setItemid(ItemID);
					itemDatabase[i].setItemname(ItemName);
					itemDatabase[i].setDescription(Description);
					itemDatabase[i].setCategory(category);
					itemDatabase[i].setSupplierName(supplierName);
					itemDatabase[i].setSupplierContact(SupplierContact);
					itemDatabase[i].setAvailableQty(availableQuantity);
				}
			}
			if(choice == 2) {
				System.out.println("What infromation?");
				System.out.println("	1. Name");
				System.out.println("	2. Descriptiom");
				System.out.println("	3. Category");
				System.out.println("	4. Supplier name");
				System.out.println("	5. Supplier contacts");
				System.out.println("	6. Price");
				System.out.println("	7. Available qty");
				System.out.println("	8. Quit");
				System.out.println("Please enter your choice > ");
				update = myinput.nextInt();
			}
			
			if(choice == 3) {
				System.out.print("");
			}
			
			if(choice == 4) {
				for(int i= 0; i<=qty; i++) {
					
					itemDatabase[i].getItemid();
					itemDatabase[i].getItemname();
					itemDatabase[i].getSupplierName();
					itemDatabase[i].getSupplierContact();
					
					System.out.print(itemDatabase[i].toString());
				
				} 
				
			}
			
			if(choice == 5) {
				
			}
			
			if(choice == 6) {
				System.out.print("Thank you for using the program.");
			break;	
		
		}
	}
}

