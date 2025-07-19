//Bus booking management system
import java.util.*;
class bus{
    String name;
    int age;
    String source;
    String dest;
    int seatnum;
    String seattype;
    int[] totalseats=new int[10];

    bus() {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Book a ticket");
            System.out.println("2. Cancel a ticket");
            System.out.println("3. Check availability");
            System.out.println("4. View booking details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = input.nextInt();
            help(choice);
    }

    void getinfo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter your age: ");
        age = input.nextInt();
        
        input.nextLine(); 

        System.out.print("Enter your source: ");
        source = input.nextLine();
        
        System.out.print("Enter your destination: ");
        dest = input.nextLine();
        
        System.out.print("Enter your seat number[1-10]:");
        seatnum = input.nextInt();
        checkAvailability();
        
        input.nextLine(); 
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + dest);
        System.out.println("Seat Number: " + seatnum);
    }
    void book() {
    }
    void cancel() {
        System.out.println("Booking cancelled for " + name + ".");
    }
    
    void checkAvailability() {
        System.out.println("Checking availability for " + name + "...");

        if(seatnum < 1 || seatnum > 10) {
            System.out.println("Invalid seat number. Please enter a number between 1 and 10.");
            return;
        }else if(totalseats[seatnum - 1] == 1) {
            System.out.println("Sorry! Seat number " + seatnum + " is already booked.");
            System.out.println("Available seats:");
            for(int i = 0; i < totalseats.length; i++) {
                if(totalseats[i] == 0) {
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println("\nPlease choose another seat.");
            getinfo();  
        } else {
            totalseats[seatnum - 1] = 1; 
            System.out.println("Booking confirmed for " + name + " from " + source + " to " + dest + " in seat number " + seatnum + ".");
            exit();

        }
        
    }

    void help(int choice) {
        switch (choice) {
                case 1:
                    getinfo();
                    book();
                    break;
                case 2:
                    cancel();
                    break;
                case 3:
                    checkAvailability();
                    break;
                case 4:
                    viewBooking();
                    break;
                case 5:
                    exit();
                    //new bus();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    new bus();
                    break;
            }
    }
    void exit() {
        System.out.println("Thank you for using the Bus Booking Management System. Goodbye!");
        new bus();
    }
    void viewBooking() {
        System.out.println("Current booking details:");
        display();
    }

}
public class busbooking {
    public static void main(String[] args) {
        System.out.println("====WELCOME TO BUS BOOKING MANAGEMENT SYSTEM====");
        
        bus b = new bus();
        //b.getinfo();
        //b.display();
        
    }
}
