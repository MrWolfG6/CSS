/**
 * Displays every prime number between 1 and 500.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 500:");

        // Check every number in the requested range.
        for (int number = 1; number <= 500; number++) {
            // 1 is not prime, so only numbers greater than 1 can qualify.
            boolean isPrime = number > 1;

            // A divisor larger than the square root cannot be needed:
            // any larger factor would have a matching smaller factor.
            for (int divisor = 2; isPrime && divisor * divisor <= number; divisor++) {
                // A zero remainder means the number has a factor other than 1 and itself.
                if (number % divisor == 0) {
                    isPrime = false;
                }
            }

            // Print the number only when no divisor was found.
            if (isPrime) {
                System.out.print(number + " ");
            }
        }

        System.out.println();
    }
}