import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle[] vehicles = new Vehicle[3];
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Enter information and create vehicles (xe1, xe2, xe3)");
            System.out.println("2. Display tax declaration table for vehicles");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    for (int i = 0; i < vehicles.length; i++) {
                        System.out.print("Enter owner name for vehicle " + (i + 1) + ": ");
                        String ownerName = scanner.nextLine();
                        System.out.print("Enter value for vehicle " + (i + 1) + ": ");
                        double value = scanner.nextDouble();
                        System.out.print("Enter cylinder capacity for vehicle " + (i + 1) + ": ");
                        double cylinderCapacity = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline
                        vehicles[i] = new Vehicle(ownerName, value, cylinderCapacity);
                    }
                    break;
                case 2:
                    System.out.printf("%-20s %-10s %-20s %-10s\n", "Owner", "Value", "Cylinder Capacity", "Tax");
                    System.out.println("-------------------------------------------------------------");
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle != null) {
                            System.out.println(vehicle);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}