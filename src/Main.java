import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while(run){
            System.out.println("Välkommen till Mones golfshop");
            System.out.println("Gör ditt val");
            System.out.println();
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5. Avsluta");

            int choice = scanner.nextInt();

            if(choice == 5){
                System.out.println("Tack och välkommen åter!");
                scanner.nextLine();
                break;
            }
        }



    }
}