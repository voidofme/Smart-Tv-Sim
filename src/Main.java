import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.print("TV Status: ");
            if (smartTv.turnedOn) {
                System.out.println("TV is turned on!");
            } else {
                System.out.println("TV is turned off!");
                System.out.print("Will you press the power button? (Y/N): ");
                smartTv.powerButton = userInput.nextLine();
                if (smartTv.powerButton.equalsIgnoreCase("Y")) {
                    smartTv.turnedOn = true;
                    System.out.println("\nThe TV is turned on!");
                } else {
                        System.out.println("Nothing happens...\n");
                }
            }
        } while (!(smartTv.turnedOn));
        System.out.println("Smart TV is now turned on and we'll continue to work on it...");
    }
}