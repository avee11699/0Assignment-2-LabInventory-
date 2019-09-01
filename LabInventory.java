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
				
			}
			if(choice == 2) {
				System.out.println("which item you wish to update?");
				update = myinput.next();
			}
		
		}
	}
}

