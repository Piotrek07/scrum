import java.util.Scanner;

public class NWD {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj jakas liczbe: ");
            int podanaliczba1 = scanner.nextInt();
            System.out.println("Podaj druga liczbe: ");
            int podanaLiczba2 = scanner.nextInt();

            System.out.println("NWD dla liczb " + podanaliczba1 + " oraz " + podanaLiczba2 +
                    "wynosi: " + NWD(podanaliczba1, podanaLiczba2));
        }catch (Exception e ){
        System.out.println("Musisz podac liczbe calkowita !");
    }
    }

    public static int NWD(int pierwsza, int druga) {
        while (pierwsza != druga) {
            if (pierwsza > druga) {
                pierwsza = pierwsza - druga;
            }
            else {
                druga = druga - pierwsza;
            }
        }
        return pierwsza;
    }
}

