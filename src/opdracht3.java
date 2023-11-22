import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class opdracht3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String Name = scanner.nextLine();
        String greeting = "Hello, " + Name + ", nice to meet you!";
        System.out.println(greeting.toUpperCase());
    }
}
