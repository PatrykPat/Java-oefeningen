import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class opdracht5 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int gross;
        int dozen;
        int eggs;

        // Dividend
        eggs = myObj.nextInt();

        int lefts = eggs % 12;
        int leftsvgross = eggs % 144;
        dozen = leftsvgross/12;
        gross = eggs/144;
        System.out.println("you have " +gross+ " gross and " +dozen+ " dozen and " +lefts+ " eggs");
    }
}
