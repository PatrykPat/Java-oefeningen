import java.util.Scanner;

public class h3opdracht1 {
    public static void main(String[] args) {
        int myNum1, myNum2;
        int loopCount = 0;
        boolean snakeEyes = false;

        do {
            loopCount++;
            myNum1 = (int)(Math.random() * 6) + 1;
            myNum2 = (int)(Math.random() * 6) + 1;

            if (myNum1 == 1 && myNum2 == 1) {
                snakeEyes = true;
                System.out.println("Snake eyes nummer 1 = " + myNum1);
                System.out.println("Snake eyes nummer 2 = " + myNum2);
                System.out.println("Snake eyes!");
            } else {
                System.out.println("nummer 1 = " + myNum1);
                System.out.println("nummer 2 = " + myNum2);
            }

        } while (!snakeEyes);

        System.out.println("It took " + loopCount + " iterations to get snake eyes.");
        double probability = Math.pow((35.0 / 36.0), loopCount);
        System.out.println("The probability of not getting snake eyes in " + loopCount + " rolls is: " + (probability * 100) + "%");
    }
}