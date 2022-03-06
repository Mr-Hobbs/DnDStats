// Author: Spencer Hobbs
// Created January 2022
// Updated 3/6/22

package DndPackage;

import java.util.Random;
import java.util.Scanner;

public class dndStats {

   public static void BasicCharacters() {
  
       int stat;
       Random rand;
       int i = 0;
       int numDndCharacters = 0;
       Scanner scnr = new Scanner(System.in);
    
       stat = 0; // used in finding the 6 charcter stats
       rand = new Random();
       
    // Determines race
       String[] raceName = new String[9];
           
       raceName[0] = ("Dragonborn");
       raceName[1] = ("Dwarf");
       raceName[2] = ("Elf");
       raceName[3] = ("Gnome");
       raceName[4] = ("Half-Elf");
       raceName[5] = ("Halfling");
       raceName[6] = ("Half-Orc");
       raceName[7] = ("Human");
       raceName[8] = ("Tiefling");
              
    // Determines gender
       String[] gender = {"male", "female"}; // alternate wat to initialize array elements
    
       //gender[0] = ("male");
       //gender[1] = ("female");       
       
    //Class determination 
       String[] className = new String[12];
           
       className[0] = ("Barbarian");
       className[1] = ("Bard");
       className[2] = ("Cleric");
       className[3] = ("Druid");
       className[4] = ("Fighter");
       className[5] = ("Monk");
       className[6] = ("Paladin");
       className[7] = ("Ranger");
       className[8] = ("Rogue");
       className[9] = ("Sorcerer");
       className[10] = ("Warlock");
       className[11] = ("Wizard");
    
       System.out.print("How many characters do you need?\n");
       numDndCharacters = scnr.nextInt();
       System.out.print("\n");
       
       
   i = 1;
   while (i <= numDndCharacters){   
       System.out.println("This next character has:\n");
               
       //random.nextInt(max - min + 1) + min ... do this 3x and it adds to 21
       while (stat < 3) {
           stat = rand.nextInt(18);
       }
       System.out.print(stat + " Strength");
       
       if(stat <=6 ){
       System.out.println(", oof they are wimpy.");
       }
       else if(stat >=15) {
           System.out.println(", hey they can move mountains!");
       }
       else {
           System.out.print("\n");
       }
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       }
       System.out.print(stat + " Dexterity");
       
       if(stat <=6 ){
       System.out.println(", they'll probably trip over their own feet, lol.");
       }
       else if(stat >=15) {
           System.out.println(", what are they an acrobat?");
       }
       else {
           System.out.print("\n");
       }
       
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       }
       System.out.print(stat + " Constitution");
              
       if(stat <=6 ){
       System.out.println(", can they stomach being an adventurer?");
       }
       else if(stat >=15) {
           System.out.println(", they are a hearty soul.");
       }
       else {
           System.out.print("\n");
       }
       
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       }
       System.out.print(stat + " Wisdom");
       
       if(stat <=6 ){
       System.out.println(", they are not so intuitive.");
       }
       else if(stat >=15) {
           System.out.println(", they understand the ways of the world.");
       }
       else {
           System.out.print("\n");
       }
              
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       } 
       System.out.print(stat + " Intelligence");
       
       if(stat <=6 ){
       System.out.println(", read a book, maybe?");
       }
       else if(stat >=15) {
           System.out.println(", they who know 10,000 things.");
       }
       else {
           System.out.print("\n");
       }   
       
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       } 
       System.out.print(stat + " Charisma");
      
       if(stat <=6 ){
       System.out.println(", they may lack social aptitude.\n");
       }
       else if(stat >=15) {
           System.out.println(", they are the life of the party!\n");
       }
       else {
           System.out.print("\n\n");
       }
    
              
 //Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue,
 // Sorcerer, Warlock, Wizard
        
       System.out.println("They are a " + gender[rand.nextInt(2)] + 
               " " + raceName[rand.nextInt(9)] + " " + 
               className[rand.nextInt(12)] + ".\n");
       System.out.print("----------------------------------------------------\n\n");
    
       i = i + 1;
   }
    
  }
   
//////////////////////////////////////////////////////////////////////////////////////////////
   
   public static void MoreCharacters() {
  
       int stat;
       Random rand;
       int i = 0;
       int numDndCharacters = 0;
       Scanner scnr = new Scanner(System.in);
    
       stat = 0; // used in finding the 6 charcter stats
       rand = new Random();
       
    // Determines race
       String[] raceName = {/*"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling",*/ 
       "Leonin", "Satyr", "Aarakocra", "Genasi", "Goliath", "Aasimar", "Bugbear", "Firbolg", "Goblin", "Hobgoblin", "Kenku", 
       "Kobold", "Lizardfolk", "Orc", "Tabaxi", "Triton", "Yuan-ti Pureblood", "Tortle", "Changeling", "Kalashtar", "Shifter", 
       "Warforged"};
                         
    // Determines gender
       String[] gender = {"male", "female"}; // alternate wat to initialize array elements
 
       
    //Class determination 
       String[] className = new String[14];
           
       className[0] = ("Barbarian");
       className[1] = ("Bard");
       className[2] = ("Cleric");
       className[3] = ("Druid");
       className[4] = ("Fighter");
       className[5] = ("Monk");
       className[6] = ("Paladin");
       className[7] = ("Ranger");
       className[8] = ("Rogue");
       className[9] = ("Sorcerer");
       className[10] = ("Warlock");
       className[11] = ("Wizard");
       className[12] = ("Artificer");
       className[13] = ("Blood Hunter");
    
       System.out.print("How many characters do you need?\n");
       numDndCharacters = scnr.nextInt();
       System.out.print("\n");
       
       
   i = 1;
   while (i <= numDndCharacters){   
       System.out.println("This next character has:\n");
               
       //random.nextInt(max - min + 1) + min ... do this 3x and it adds to 21
       while (stat < 3) {
           stat = rand.nextInt(18);
       }
       System.out.print(stat + " Strength");
       
       if(stat <=6 ){
       System.out.println(", oof they are wimpy.");
       }
       else if(stat >=15) {
           System.out.println(", hey they can move mountains!");
       }
       else {
           System.out.print("\n");
       }
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       }
       System.out.print(stat + " Dexterity");
       
       if(stat <=6 ){
       System.out.println(", they'll probably trip over their own feet, lol.");
       }
       else if(stat >=15) {
           System.out.println(", what are they an acrobat?");
       }
       else {
           System.out.print("\n");
       }
       
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       }
       System.out.print(stat + " Constitution");
              
       if(stat <=6 ){
       System.out.println(", can they stomach being an adventurer?");
       }
       else if(stat >=15) {
           System.out.println(", they are a hearty soul.");
       }
       else {
           System.out.print("\n");
       }
       
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       }
       System.out.print(stat + " Wisdom");
       
       if(stat <=6 ){
       System.out.println(", they are not so intuitive.");
       }
       else if(stat >=15) {
           System.out.println(", they understand the ways of the world.");
       }
       else {
           System.out.print("\n");
       }
              
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       } 
       System.out.print(stat + " Intelligence");
       
       if(stat <=6 ){
       System.out.println(", read a book, maybe?");
       }
       else if(stat >=15) {
           System.out.println(", they who know 10,000 things.");
       }
       else {
           System.out.print("\n");
       }   
       
       stat = 0;
       //////////////////////////////////////////////////////////////////////
       
       while (stat < 3) {
           stat = rand.nextInt(18);
       } 
       System.out.print(stat + " Charisma");
      
       if(stat <=6 ){
       System.out.println(", they may lack social aptitude.\n");
       }
       else if(stat >=15) {
           System.out.println(", they are the life of the party!\n");
       }
       else {
           System.out.print("\n\n");
       }
    
        
       System.out.println("They are a " + gender[rand.nextInt(2)] + 
               " " + raceName[rand.nextInt(9)] + " " + 
               className[rand.nextInt(12)] + ".\n");
       System.out.print("----------------------------------------------------\n\n");
    
       i = i + 1;
   }
   

    
  }   
   
   
}
