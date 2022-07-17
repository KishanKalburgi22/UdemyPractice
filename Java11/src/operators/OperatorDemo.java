package operators;

public class OperatorDemo {

    public static void main(String[] args) {

        //Plus(+) operator
        int sum = 1 + 5;
        System.out.println("1 + 5 = " + sum);

        // Subtract(-) operator
        int sub = 4 - 2;
        System.out.println("4 - 2 = " + sub);

        // Multiplication(*) operator
        int mul = 4 * 7;
        System.out.println("4 * 7 = " + mul);

        // Division(/) operator
        int div = 8 / 2;
        System.out.println("8 / 2 = " + div);

        // Modules (%) operator
        int mod = 5 % 2;
        System.out.println("5 % 2 = " + mod);

        // Abbreviating operators
        int num = 5;
        num++;
        System.out.println(num);

        System.out.println("6 + 4 = " + (num += 4));
        System.out.println("10 - 4 = " + (num -= 4));
        System.out.println("6 * 4 = " + (num *= 4));
        System.out.println("24 / 4 = " + (num /= 4));

        //Logical AND operator (&&)
        int score = 50;
        if (score > 10 && score < 100)
            System.out.println("Both the conditions have matched.");

        //Logical OR operator (||)
        if (score > 10 || score < 40)
            System.out.println("Either of the conditions have been met");

        // Assignment & Equals Too operator
        int number = 50;
        if (number == 50)
            System.out.println("Number is equals to 50");

        boolean isCar = false;
        if (isCar = true)
            System.out.println("This is with assignment operator");

        // NOT (!) operator
        isCar = false;
        if (!isCar)
            System.out.println("This example for NOT operator.");

        // Ternary operator
        boolean wasCar = !isCar ? true : false;
        if (wasCar)
            System.out.println(wasCar);

        // Challenge on operators
        double num1 = 20d;
        double num2 = 80d;
        double res = (num1 + num2) * 100d;
        double rem = res % 40d;
        boolean result = rem == 0 ? true : false;
        System.out.println("Result --> " + result);
        if (!result)
            System.out.println("Got some remainder");

    }
}
