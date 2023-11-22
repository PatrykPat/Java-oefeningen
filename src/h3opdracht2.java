public class h3opdracht2 {
    public static void main(String[] args) {
        int maxNumber = 0;
        int maxDivisors = 0;

        for (int i = 1; i <= 10000; i++) {
            int divisors = countDivisors(i);
            if (divisors > maxDivisors) {
                maxDivisors = divisors;
                maxNumber = i;
            }
        }

        System.out.println("The integer with the most divisors between 1 and 10000 is: " + maxNumber);
        System.out.println("It has " + maxDivisors + " divisors.");
    }

    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}