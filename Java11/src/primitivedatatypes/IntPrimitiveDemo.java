package primitivedatatypes;

public class IntPrimitiveDemo {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println("The Min Int value - " + min);
        System.out.println("The Max Int value - " + max);
        System.out.println("The Int OverFlow - " + (max + 1));
        System.out.println("The Int UnderFlow - " + (min - 1));
    }
}
