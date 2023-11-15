import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //        opdracht 1
//        System.out.println("********            *****                *************                       ");
//        System.out.println("**    ***          ***  ***                   ***                     ");
//        System.out.println("**     ***        ***    ***                  ***                ");
//        System.out.println("**     ***       ***      ***                 ***                   ");
//        System.out.println("**    ***       **************                ***          ");
//        System.out.println("*******        ****************               ***                 ");
//        System.out.println("**            ***            ***              ***              ");
//        System.out.println("**           ***              ***             ***           ");
//        System.out.println("**          ***                ***            ***             ");
//        System.out.println("**         ***                  ***           ***              ");

        //        opdracht 2
//        int myNum1 = (int)(Math.random() *6) + 1;
//        int myNum2 = (int)(Math.random()*6) + 1;
//        int total = myNum1 + myNum2;
//        System.out.println("nummer 1 = "+myNum1);
//        System.out.println("nummer 2 = "+myNum2);
//        System.out.println(total);

        //        opdracht 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What is your name? ");
//        String Name = scanner.nextLine();
//        String greeting = "Hello, " + Name + ", nice to meet you!";
//        System.out.println(greeting.toUpperCase());

        //        opdracht 5
//        Scanner myObj = new Scanner(System.in);
//        int quarters;
//        int dimes;
//        int nickels;
//        int pennies;
//        System.out.println("how many quarters you got?");
//        quarters =  myObj.nextInt();
//        float quarters1 = 0.25f * quarters;
//        System.out.println("how many dimes you got?");
//        dimes = myObj.nextInt();
//        float dimes1 = 0.10f * dimes;
//        System.out.println("how many nickels you got?");
//        nickels = myObj.nextInt();
//        float nickels1 = 0.05f * nickels;
//        System.out.println("how many pennies you got?");
//        pennies = myObj.nextInt();
//        float pennies1 = 0.01f * pennies;
//        float total = quarters1 + dimes1 + nickels1 + pennies1;
//        System.out.println(total);

        //        opdracht 5
//        Scanner myObj = new Scanner(System.in);
//        int gross;
//        int dozen;
//        int eggs;
//
//        // Dividend
//        eggs = myObj.nextInt();
//
//        int lefts = eggs % 12;
//        int leftsvgross = eggs % 144;
//        dozen = leftsvgross/12;
//        gross = eggs/144;
//        System.out.println("you have " +gross+ " gross and " +dozen+ " dozen and " +lefts+ " eggs");


        //        opdracht 6
//        Scanner myObj = new Scanner(System.in);
//        String name;
//
//        System.out.println("what is your name? ");
//        name = myObj.nextLine();
//
//        System.out.println(name);
//        int index = name.indexOf(" ");
//        String voornaam = name.substring(0, index);
//        String achternaam = name.substring(index +1);
//        String initial1 = voornaam.substring(0,1);
//        String initial2 = achternaam.substring(0,1);
//
//        System.out.println("je voornaam is " + voornaam + " en het heeft " + voornaam.length() + " characters");
//        System.out.println("je achternaam is " + achternaam + " en het heeft " + achternaam.length() + " charachters");
//        System.out.println("jouw initials zijn " + initial1.toUpperCase() + initial2.toUpperCase());

        //        opdracht 7
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

