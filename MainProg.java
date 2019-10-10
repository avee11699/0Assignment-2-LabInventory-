/**
 * 
 */
package javaSimpleOOP;
import java.util.Scanner;

/**
 * @author Akhilesh
 *
 */
public class MainProg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instantiating Object Variables
		
		car toyota = new car();
		
		System.out.println(toyota.toString());
		
		System.out.println(); //leaving a line
		
		//==========================================================================================================
		
		//instantiating Object Array
		
		car nissan[] = new car[3]; //simple array declaration *NOTE: WE HAVEN'T INSTANTIATED YET...(NOT USED THE CONSTRUCTOR)
		
		//HERE nissan is just and array of size 3 of datatype car....NOT an object
		
		//NOW LET'S INSTANTIATE... Since it is an array all elements needs to be accessed for instantiation
		//that's why a for loop is used
		
		for(int i=0; i<nissan.length; i++) {
			nissan[i] = new car();
		}
		
		//HERE all elements of the array nissan have been instantiated as the object car....let's check it out!
		
		//output all objects in the array
		for(int i=0; i<3; i++) {
			System.out.println(nissan[i].toString());
		}
		
		System.out.println();
		//========================================================================================================
		
		//user inputs size of array...
		
		Scanner keyboard = new Scanner(System.in);
		
		car[] honda;
	
		System.out.print("Enter size of array: ");
		int size = keyboard.nextInt();  //user input
		
		honda = new car[size]; // declaration of array
		
		
		//INSTANTIATION
		for(int i=0; i<honda.length; i++) {
			honda[i] = new car();
		}
		
		for(int i=0; i<honda.length; i++) {
			System.out.println(honda[i].toString());
		}
		
		System.out.println();
		//==============================================================================================================
		//TILL NOW WE HAVE BEEN USING THE DEFAULT CONSTRUCTORS
		//NOW LET'S USE THE OVERLOADED CONSTRUCTOR
		
		car ferrari[] = new car[3];
		
		//Use of u=overloaded constructor
		ferrari[0] = new car("A123");
		ferrari[1] = new car("B483");
		ferrari[2] = new car("C765");
		
		// let's check it out!!
		for(int i=0; i<ferrari.length; i++) {
			System.out.println(ferrari[i].toString());
		}
		
		System.out.println("===================================Using getter================================");
		
		// we can also use the method getPlateNo to get the value of PlateNo
		for(int i=0; i<ferrari.length; i++) {
			System.out.println(ferrari[i].getPlateNo());
		}
	
		
		//Now change the PlateNo of the object at index 1 to a value entered by the user
		//Use the setter setPlateNo
		
		System.out.print("Enter new plateNo: ");
		String Pn = keyboard.next();
		
		ferrari[1].setPlateNo(Pn);
		
		//let's check!
		for(int i=0; i<ferrari.length; i++) {
			System.out.println(ferrari[i].toString());
		}
				
		//we see that the value at index 1 has changed...

		System.out.println();
		//==================================================================================================================		
		
		keyboard.close();
	}

}
