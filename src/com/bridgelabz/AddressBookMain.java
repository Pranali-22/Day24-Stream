/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Dell
 * UC12 - Ability to sort the entries in
 * the address book by City,
 * State, or Zip
 */

public class AddressBookMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<AddressBook> addressBookList = new ArrayList<>();  
		AddressBook addressBook1 = new AddressBook();
		AddressBook addressBook2 = new AddressBook();
		
		int choice =1;
		//Store contacts to addressBook1
		
		while (choice!=0){         
            switch (choice){
                case 0:
                    return;                   
                case 1:
                    addressBook1.addToAddressBook();
                    break;
                case 2:
                    addressBook1.editPersonName();
                    break;   
                case 3:
                	addressBook1.displayAddressBook();
                	break;
                case 4:
                	addressBook1.deleteContact();
                	break;
            }
            
            System.out.println("Press 0 to exit \nPress 1 to add more contact \nPress 2 to edit contact \nPress 3 to display\nPress 4 to delete contact");
            choice = input.nextInt();
        }
		
		//Add addressBook1 to addressBookList
		addressBookList.add(addressBook1);
		
		
		//Store contacts to addressBook2
		System.out.println("Enter input for 2nd AddressBook");
		choice =1;		
		while (choice!=0){
         
            switch (choice){
                case 0:
                    return;
                   
                case 1:
                    addressBook2.addToAddressBook();
                    break;
                case 2:
                    addressBook2.editPersonName();
                    break;   
                case 3:
                	addressBook2.displayAddressBook();
                	break;
                case 4:
                	addressBook2.deleteContact();
                	break;
            }
            
            System.out.println("\nPress 0 to exit \nPress 1 to add more contact \nPress 2 to edit contact \nPress 3 to display \nPress 4 to delete contact");
            choice = Integer.parseInt(input.next());
        }
		
		//add addressBook2 to  addressBookList
		addressBookList.add(addressBook2);		
		
		
		//Display all addressBooks stored in addressBookList
		System.out.println("Displaying all address books stored in arraylist\n");
		for(int i=0;i<addressBookList.size();i++) {
			addressBookList.get(i).displayAddressBook();
		}
		
		//Display person within the city
		System.out.println("\nEnter city name to find person");
		String cityName = input.next();	
		System.out.println("Display person within the city");
		for(int i=0;i<addressBookList.size();i++) {
			addressBookList.get(i).displayPersonInCity(cityName);
		}
		
		//Display person within the state
		System.out.println("\nEnter state to find person");
		String stateName = input.next();		
		System.out.println("Display person within the state");
		for(int i=0;i<addressBookList.size();i++) {
			addressBookList.get(i).displayPersonInState(stateName);
		}
		
		//UC11 - Ability to sort the entries in the
		// address book alphabetically by
		// Person’s name
		
		System.out.println("Display AddressBook in sorted order");
		for(int i=0;i<addressBookList.size();i++) {
			addressBookList.get(i).sortAddressBook();
		}
	
		
		//UC12 - Ability to sort the entries in
		// the address book by City,
		// State, or Zip
		
		System.out.println("Enter choice to sort Address Book upon");
		String option = input.next();
		
		for(int i=0;i<addressBookList.size();i++) {
			addressBookList.get(i).sortAddressBookByCityOrStateOrZip(option);
		}
	}
}
