package codingchallengesec5;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(100);
        System.out.println(reverse(123));
        System.out.println(reverse(-121));
        System.out.println(reverse(100));
        System.out.println(getDigitCount(-11));
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        numberToWords(00);

    }

    public static void numberToWords(int number) {
        int original = number;
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int totalDigits = getDigitCount(number);
            number = reverse(number);
            int reverseCount = getDigitCount(number);
            int lastDigit;
            while (number > 0) {
                lastDigit = number % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                number /= 10;
            }
            if (reverseCount != totalDigits) {
                int diff = totalDigits - reverseCount;
                while (diff > 0) {
                    System.out.println("Zero");
                    diff--;
                }
            }
            if (original == 0) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int lastDigit;
        int reverse = 0;
        boolean isNegative = false;
        if (number < 0) {
            number = number * -1;
            isNegative = true;
        }
        while (number > 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        if (isNegative) {
            return reverse * -1;
        } else
            return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        return String.valueOf(number).length();
    }
}
