import java.util.Scanner;

/* ***************************************
  @author    Noah Gomes
  @version   1

  A program that prints a flag in a certain
  pattern

  ****************************************/

public class flags {

    public static String everyNth(String str, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Interval must be greater than 0");
        }
        StringBuilder result = new StringBuilder(str);
        // This will replace every nth character with '*'
        for (int i = n - 1; i < str.length(); i += n) {
            result.setCharAt(i, '*');
        }
        return result.toString();
    }

    public static void loop() {
        try (Scanner keyboard = new Scanner(System.in)) {

            System.out.print("Width: ");
            int width = keyboard.nextInt();

            System.out.print("Height: ");
            int height = keyboard.nextInt();

            System.out.print("Interval: ");
            int interval = keyboard.nextInt();

            // for loop
            for (int i = 1; i <= height; ++i) {
                System.out.println(everyNth("0".repeat(width), interval + 1));
            }
        }
    }

    public static void main(String[] args) {
        loop();

        // System.out.println(everyNth("testtesttest", 3));

    }
}
