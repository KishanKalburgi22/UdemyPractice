package codingchallengesec5;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                sum = sum + scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {
                long avg = sum == 0 ? 0 : Math.round((double) sum / count);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }
        }
    }
}
