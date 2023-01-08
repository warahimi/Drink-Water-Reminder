import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many cups of water they want to drink per day
        System.out.println("How many cups of water do you want to drink per day?");
        int cupsPerDay = scanner.nextInt();

        // Ask the user how often they want to be reminded, in hours
        System.out.println("How often do you want to be reminded, in hours?");
        int reminderInterval = scanner.nextInt();

        // Calculate the number of reminders per day
        int remindersPerDay = 24 / reminderInterval;
        System.out.println("Number of reminders per day: "+ remindersPerDay);

        // Calculate the number of cups the user needs to drink per reminder
        int cupsPerReminder = cupsPerDay / remindersPerDay;
        System.out.println("Cups per reminder: "+ cupsPerReminder);
        // Set up a counter for the number of cups the user has drunk so far
        int cupsDrunk = 0;

        // Set up a loop to send reminders until the user has drunk enough water
        while (cupsDrunk < cupsPerDay) {
            // Send a reminder to drink water
            System.out.println("Remember to drink " + cupsPerReminder + " cups of water!");

            // Update the number of cups the user has drunk
            cupsDrunk += cupsPerReminder;
        }

        // Thank the user for reaching their goal
        System.out.println("Congratulations, you have reached your daily water drinking goal!");
    }
}