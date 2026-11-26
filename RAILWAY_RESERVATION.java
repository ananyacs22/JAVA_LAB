import java.util.Scanner;
import java.util.InputMismatchException;
class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}
class Reservation {
    private boolean[] seats = new boolean[51]; 

    public void reserveSeat(int seatNumber) throws SeatAlreadyBookedException, ArrayIndexOutOfBoundsException {
        if (seatNumber < 1 || seatNumber > 50) {
            throw new ArrayIndexOutOfBoundsException("Invalid Seat Number! Please choose a seat between 1 and 50.");
        }
        if (seats[seatNumber]) {
            throw new SeatAlreadyBookedException("Seat " + seatNumber + " is already booked by another passenger!");
        }
        seats[seatNumber] = true;
        System.out.println("Success: Seat " + seatNumber + " has been successfully reserved for you!");
    }
}
public class RailwayReservation {
    public static void main(String[] args) {
        Reservation system = new Reservation();
        Scanner scanner = new Scanner(System.in);
        String choice;

        System.out.println("=== Welcome to the Railway Reservation Management System ===");
        System.out.println("Available Seats: 1 to 50\n");

        do {
            try {
                System.out.print("Enter the seat number you want to reserve: ");
                int seatNumber = scanner.nextInt(); 
                system.reserveSeat(seatNumber);

            } catch (InputMismatchException e) {
                System.out.println("Error: Incorrect input type! Seat numbers must be integers only.");
                scanner.next();            
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
                
            } catch (SeatAlreadyBookedException e) {
                System.out.println("Error: " + e.getMessage());
                
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                
            } finally {
                System.out.println("[System Notice: Current transaction session completed.]\n");
            }

            System.out.print("Do you want to book another seat? (yes/no): ");
            choice = scanner.next();
            System.out.println();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using the Railway Reservation Management System!");
        scanner.close();
        System.out.println("ANANYA");
        System.out.println("1WA25CS033");
    }
}
