package codingchallengesec5;

public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(-2);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            int count = 1;
            while (count <= number) {
                if (number % count == 0) {
                    System.out.println(count);
                }
                count++;
            }
        }
    }
}
