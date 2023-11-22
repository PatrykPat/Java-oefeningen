import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class opdracht2 {
    public static void main(String[] args) {
        int myNum1 = (int)(Math.random() *6) + 1;
        int myNum2 = (int)(Math.random()*6) + 1;
        int total = myNum1 + myNum2;
        System.out.println("nummer 1 = "+myNum1);
        System.out.println("nummer 2 = "+myNum2);
        System.out.println(total);
    }
}
