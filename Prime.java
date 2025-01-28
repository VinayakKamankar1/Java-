public class Prime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 30:");

        for (int i = 1; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}