
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class opdracht7 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\patry\\Downloads\\gegevens.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String studentName = br.readLine();

            int exam1 = Integer.parseInt(br.readLine());
            int exam2 = Integer.parseInt(br.readLine());
            int exam3 = Integer.parseInt(br.readLine());
            double averageGrade = (exam1 + exam2 + exam3) / 3.0;

            System.out.println("Student: " + studentName);
            System.out.println("gemmidlede cijfer: " + averageGrade);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
