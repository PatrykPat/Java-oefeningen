import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class opdracht6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String name;

        System.out.println("what is your name? ");
        name = myObj.nextLine();

        System.out.println(name);
        int index = name.indexOf(" ");
        String voornaam = name.substring(0, index);
        String achternaam = name.substring(index +1);
        String initial1 = voornaam.substring(0,1);
        String initial2 = achternaam.substring(0,1);

        System.out.println("je voornaam is " + voornaam + " en het heeft " + voornaam.length() + " characters");
        System.out.println("je achternaam is " + achternaam + " en het heeft " + achternaam.length() + " charachters");
        System.out.println("jouw initials zijn " + initial1.toUpperCase() + initial2.toUpperCase());

    }
}
