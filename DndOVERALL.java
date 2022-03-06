// Author: Spencer Hobbs
// Created January 2022
// Updated 3/6/22


package DndPackage;

import java.util.Scanner;
import java.util.Random;

public class DndOVERALL {
   
    public static void main (String[] args) {
        //call die roller method for each stat
        
        //call random race method
        
        //call random class method
        
        //call random sub-class method

        Scanner menuScnr = new Scanner(System.in); // Creating Scanner object
        boolean endOper = false;
        
        /**
         * Print a menu for the user to select one of the two options:
         *
         */

        System.out.println("Menu\n" 
                + "1. Basic Charater Classes\n" 
                + "2. More Character Classes\n"
                + "3. Close the Program\n"
                + "\nPlease select a menu item:");
        
        while (!endOper && menuScnr.hasNextInt()) {
            int input = menuScnr.nextInt();//Getting the input from the user
            
            //API NOTE: submitting a non-number into the switch ends the program
            
            /* Perform operations according to the menu item selected */
            switch (input) {
                case 1:
                    dndStats.BasicCharacters();
                    break;
                case 2:
                    dndStats.MoreCharacters();
                    break;
                case 3:
                    endOper = true;
                    break;
                default:
                    System.out.println("\nPlease make an appropriate selection - 1, 2, or 3");
                    break;
            }
            
            if (!endOper) {	
            	System.out.println("Menu\n" 
                      + "1. Basic Charater Classes\n" 
                      + "2. More Character Classes\n"
                      + "3. Close the Program\n" 
                      + "\nPlease select a menu item:");
	    }
    
 
    
        }
    }
}
