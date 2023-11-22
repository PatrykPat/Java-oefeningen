import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class opdracht4 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        System.out.println("how many quarters you got?");
        quarters =  myObj.nextInt();
        float quarters1 = 0.25f * quarters;
        System.out.println("how many dimes you got?");
        dimes = myObj.nextInt();
        float dimes1 = 0.10f * dimes;
        System.out.println("how many nickels you got?");
        nickels = myObj.nextInt();
        float nickels1 = 0.05f * nickels;
        System.out.println("how many pennies you got?");
        pennies = myObj.nextInt();
        float pennies1 = 0.01f * pennies;
        float total = quarters1 + dimes1 + nickels1 + pennies1;
        System.out.println(total);
    }
}
