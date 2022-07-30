package codingchallengesec5;

public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int temp = 0;
        int firstDigit = 0;
        int reverse = 0;
        while (number > 0) {
            temp = number % 10;
            reverse = reverse * 10;
            reverse += temp;
            number = number / 10;
        }
        firstDigit = reverse % 10;
        return firstDigit + lastDigit;
    }
}
