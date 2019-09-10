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
		int update;
		int fail = 0;
		String ItemID;
		String ItemName;
		String Description;
		String category = null; 
		String supplierName;
		int SupplierContact;
		int price;
		int availableQuantity;
		int size = 70;
		Item[]itemDatabase = new Item[size];
		int qty = 0;
		boolean a = true; 
		String id = null;
		/**
		 * display menu 
		 */
		while( a = true){	
			System.out.println("What do you want to do?");
			System.out.println("	1. Enter a new item to inventory(password required)");
			System.out.println("	2. Change information of an existing item(password required)");
			System.out.println("	3. Display all the items with the specifies category");
			System.out.println("	4. Display all items to be re-ordered");
			System.out.println("	5. Number of items currently in store");
			System.out.println("	6. Quit");
			System.out.print("Please enter your choice > ");
			 
			int choice = myinput.nextInt();
			
			if(choice == 1) {
				for(fail = 0; fail <= 3; fail++) {
					System.out.print("enter password: ");
				    password = myinput.next();
					
					if(password.equalsIgnoreCase(password)) {
						
						System.out.print("How many items you want to enter?");
						qty = myinput.nextInt();
						Item[] itemdatabase = new Item[size];
						
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
					else  {
						System.out.print("Program detected suspicious activity and is terminating!");
							break;
					}
				}
			}
				
				
			/**
			 * option 2
			 * update data in the attributes
			 */
			
			if(choice == 2) {
				for(fail = 0; fail <= 3; fail++) {
					System.out.print("enter password: ");
					password = myinput.next();
					
					if(password.equalsIgnoreCase(password)) {
						
				
						for(int i=0; i<size; i++) {
							System.out.print("enter item Id you wish to update: ");
							id = myinput .next();
							
							if(itemDatabase[i].getItemid().equals(id)) {
								
								System.out.println("What infromation of the item you wish to update?");
								System.out.println("	1. Name: "+ itemDatabase[i].getItemname());
								System.out.println("	2. Descriptiom: "+ itemDatabase[i].getDescription());
								System.out.println("	3. Category: "+ itemDatabase[i].getCategory());
								System.out.println("	4. Supplier name: "+ itemDatabase[i].getSupplierName());
								System.out.println("	5. Supplier contacts: "+ itemDatabase[i].getSupplierContact());
								System.out.println("	6. Price: " + itemDatabase[i].getPrice());
								System.out.println("	7. Available qty: "+ itemDatabase[i].getAvailableQty());
								System.out.println(" 	8. Quit");
								System.out.println("Please enter your choice > ");
								update = myinput.nextInt();
								
								if(update == 1) {
									System.out.print("Enter name: ");
									String updatename = myinput.next();
									itemDatabase[i].setItemname(updatename);
									System.out.print(itemDatabase[i]);
								}
								
								if(update == 2) {
									System.out.print("Enter Description: ");
									String updateDescription = myinput.next();
									itemDatabase[i].setItemname(updateDescription);
									System.out.print(itemDatabase[i]);
								}
								
								if(update == 3) {
									System.out.print("Enter Category: ");
									String updateCategory = myinput.next();
									itemDatabase[i].setItemname(updateCategory);
									System.out.print(itemDatabase[i]);
								}
								
								if(update == 4) {
									System.out.print("Enter supplier name: ");
									String updateSuppliername = myinput.next();
									itemDatabase[i].setItemname(updateSuppliername);
									System.out.print(itemDatabase[i]);
								}
								
								if(update == 5) {
									System.out.print("Enter Supplier contact: ");
									String updateSupplierContact = myinput.next();
									itemDatabase[i].setItemname(updateSupplierContact);
									System.out.print(itemDatabase[i]);
								}
								
								if(update == 6) {
									System.out.print("Enter Price: ");
									String updatePrice = myinput.next();
									itemDatabase[i].setItemname(updatePrice);
									System.out.print(itemDatabase[i]);
								}
								
								if(update == 7) {
									System.out.print("Enter available quantity: ");
									String updateQty = myinput.next();
									itemDatabase[i].setItemname(updateQty);
									System.out.print(itemDatabase[i]);
								}
								
								if(update == 8) {
									System.out.print("*************************");
									break;
								}
							}
							else {
								System.out.println("item ID not found in the system");
								System.out.print("Enter valid item Id next time");
								break;
							}
						}
					}
					else {
						System.out.print("worng password");
					}
				}
			}
			
			/**
			 * option 3 
			 * display all item with specified category
			 */
			if(choice == 3) {
				System.out.print("Enter Category:");
				String findItemCat = myinput.next();
				
				for(int i=0; i<size; i++) {
					if(itemDatabase[i].getCategory().contentEquals(category)) {
						System.out.println("Item ID: "+ itemDatabase[i].getItemid()+ ", Item Name: "+itemDatabase[i].getItemname()+ ", Item Description: "+ itemDatabase[i].getDescription()+ ", Supplier Name: "+ itemDatabase[i].getSupplierName()+ ", Supplier Contact: "+itemDatabase[i].getSupplierContact());
					}
				}
			}
			
			/**
			 * option 4 
			 * display details of all products which need to be re-ordered
			 */
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
				Item.totalitem();
				System.out.print(" ");
			}
			
			if(choice == 6) {
				System.out.print("Thank you for using the program.");
			System.exit(0);	
			}
		}
	}
}




