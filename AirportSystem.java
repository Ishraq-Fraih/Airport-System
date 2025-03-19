/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class AirportSystem 
{
    public static void main(String [] args)
    {
    Scanner kb = new Scanner (System.in);    
    System.out.println("Welcome to Hail Airport ");
    System.out.println();
    
    System.out.println("Enter your First Name: ");
    String firstName = kb.next();
    
    System.out.println("Enter your Last Name: ");
    String lastName = kb.next();
        
    System.out.println("Enter ID number: ");
    long id = kb.nextLong();    
    
     System.out.println("Enter Passport ID: ");
    long passportId = kb.nextLong(); 
    
     System.out.println("Enter Mobile number : ");
    long mobile = kb.nextLong();
    
    System.out.println("Enter Date of Birth");
     System.out.println("Day : ");
    int day = kb.nextInt();
    System.out.println("Month : ");
    int month = kb.nextInt();
    System.out.println("Year : ");
    int year = kb.nextInt();
    
    System.out.println("Enter Gender: ( 1.Male / 2.Female )? ");
    int gender = kb.nextInt();
    
    System.out.println();
    System.out.println("Personal Information:");
    System.out.println("Name: " + firstName + " " + lastName);
    System.out.println("ID: " + id);
    System.out.println("Passport ID: " + passportId);
    System.out.println("Mobile Number: " + mobile);
    System.out.println("Date of Birth: " + day + "/" + month + "/" + year);
    
    if (gender > 1){ 
System.out.println("Gender : Female"); 
 } 
    else {
System.out.println("Gender : Male"); 
 }
     System.out.println();
    
    System.out.println("From: ");
    String from = kb.next();
    
    System.out.println("To: ");
    String to = kb.next();
    
    System.out.println("Enter Departure Date: ");
     System.out.println("Day : ");
    int day1 = kb.nextInt();
    System.out.println("Month : ");
    int month1 = kb.nextInt();
    System.out.println("Year : ");
    int year1 = kb.nextInt();
    
     System.out.println("Enter Return Date: ");
     System.out.println("Day : ");
    int day2 = kb.nextInt();
    System.out.println("Month : ");
    int month2 = kb.nextInt();
    System.out.println("Year : ");
    int year2 = kb.nextInt();
   
    System.out.println("Enter Class: ( 1.Hospitality / 2.Business )? ");
    int Class = kb.nextInt();
    
    System.out.println();
   System.out.println("Your booking information:");
    System.out.println("From: " + from);
    System.out.println("To: " + to);
    
        switch(Class) { 
    case 1:
 System.out.print("Clsss : Your flight has been booked in Saudi Airlines ");
 System.out.print("Hospitality class at a price of 385 SAR ");
 System.out.print("advantages: basic seat , top screen , meal");
 System.out.println("thank you for choosing Saudia Airlines");
    break;
    case 2: 
 System.out.print("Class: Your flight has been booked in Saudi Airlines ");
 System.out.print(" Business class at a price of 1120 SAR ");
 System.out.print("Reclining seat, meals, entertainment during trips ");
 System.out.println("thank you for choosing Saudia Airlines");
    break;
default :
System.out.println("I apologize to you there are no flights "); 
}
        
    System.out.println("Departure Date: " + day1 + "/" + month1 + "/" + year1);
    System.out.println("Return Date: " + day2 + "/" + month2 + "/" + year2);
    System.out.println();

 for (int x = 1; x<=3; x++)
{
System.out.println("Booked , have a nice trip");
}   
    }
}
