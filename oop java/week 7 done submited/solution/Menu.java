/**
 * Title: MENU modularization
 * Date: 23/08/24
 * Copyright: © 2024 Sabbir Hasan Rabbi. All rights reserved.
 */

 package lecture4;

 import java.util.Scanner;
 
 public class Menu {
 
	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 int menuSel;
		 while (true) {
		  
			 menuSel = displayMenu();
 
			 // Handle the user's selection
			 handleSelection(menuSel);
 
			 // Exit the loop if the user chooses option 3
			 if (menuSel == 3) {
				 break;
			 }
		 }
		 
		 
		 in.close();
 
	 }

 public static int displayMenu() {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Menu:");
	 System.out.println("1. Enter data");
	 System.out.println("2. Display data");
	 System.out.println("3. Exit");
	 System.out.print("Enter your selection: ");
	 int rec=scanner.nextInt();
	 return rec;
 }
 
 public static void handleSelection(int menuSel) {
	 Scanner in = new Scanner(System.in);
	 switch(menuSel) {
		 case 1: System.out.println("Menu item 1");
					 break;
			 case 2: System.out.println("Menu item 2");
					 break;
			 case 3: System.out.println("Exiting....");
					 break;
			 default: System.out.println("Invalid selection!");	
	 }
 }
 }
 
 