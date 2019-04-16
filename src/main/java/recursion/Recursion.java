package recursion;

public class Recursion {
    public static void main(String[] args) {
        countdown(4);
        System.out.printf("%d to the power of %d is %d%n", 5, 3, power(5, 3));
        System.out.printf("%d to the power of %d is %d%n", 1, 5, power(1, 5));
        System.out.printf("%d! is %d%n", 5, factorial(5));
        System.out.printf("%d! is %d%n", 0, factorial(0));
    }

    private static void countdown(int x) {
        if (x == 0) {
            System.out.println("done!");
        } else {
            System.out.print(x + "...");
            countdown(x - 1);
        }
    }

    private static int power(int number, int power) {
        return power == 0 ? 1 : number * power(number, power - 1);
    }

    private static int factorial(int number) {
        return number < 2 ? 1 : number * factorial(number - 1);
    }
}
