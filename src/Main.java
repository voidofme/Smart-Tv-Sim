import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        Scanner userInput = new Scanner(System.in);

        System.out.println("TV Status: ");
        boolean tvStatus = smartTv.turnedOn;
            if (tvStatus) {
                System.out.println("TV is turned on!");
            } else {
                System.out.println("TV is turned off!");
                System.out.print("Will you press the power button? (Y/N): ");
                smartTv.powerButton = userInput.nextLine();
                if (Objects.equals(smartTv.powerButton, "Y") || Objects.equals(smartTv.powerButton, "N")) {
                    if (Objects.equals(smartTv.powerButton, "Y")) {
                        tvStatus = true;
                        System.out.println("The TV is turned on!");
                    } else {
                        System.out.println("OK!");
                    }
                }
            }
    }
}