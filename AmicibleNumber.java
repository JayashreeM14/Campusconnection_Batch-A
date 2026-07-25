import java.util.*;

public class AmicibleNumber {
    private static int sumOfProperDivisors(int n) {
        if (n <= 1) {
            return 0;
        }
        int sum = 1;
        int limit = (int) Math.sqrt(n);
        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) {
                sum += i;
                int other = n / i;
                if (other != i) {
                    sum += other;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        int sumFirst = sumOfProperDivisors(first);
        int sumSecond = sumOfProperDivisors(second);

        System.out.println("Sum of proper divisors of " + first + " is " + sumFirst + ".");
        System.out.println("Sum of proper divisors of " + second + " is " + sumSecond + ".");

        if (sumFirst == second && sumSecond == first) {
            System.out.println(first + " and " + second + " are amicable numbers.");
        } else {
            System.out.println(first + " and " + second + " are not amicable numbers.");
        }
        sc.close();
    }
}
