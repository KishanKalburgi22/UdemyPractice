package codingchallengesec5;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(12212));
    }

    public static boolean isPalindrome(int number) {
        int temp = 0;
        if (number < 0) {
            temp = number * -1;
        } else
            temp = number;
        int lastDigit = 0;
        int reverse = 0;
        while (temp > 0) {
            lastDigit = temp % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            temp = temp / 10;
        }
        if (number < 0) {
            number = number * -1;
            return reverse == number;
        }
        return reverse == number;
    }
}
