import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the interval (in minutes) at which to remind you to drink water: ");
        int interval = scanner.nextInt();

        while (true) {
            try {
                Thread.sleep(interval * 60000); // sleep for the specified interval in minutes
            } catch (InterruptedException e) {
                break;
            }
            System.out.println("Drink water!");
        }
    }
}