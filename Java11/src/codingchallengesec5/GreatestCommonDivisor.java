package codingchallengesec5;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int num = 1;
        int divisor = 0;
        do {
            if (first % num == 0 && second % num == 0) {
                divisor = num;
            }
            num++;
        } while (num <= first && num <= second);
        return divisor;
    }
}
