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
            System.out.println("1. Lägga till medlem");
            System.out.println("2. Söka medlem");
            System.out.println("3. Ändra medlem");
            System.out.println("4. Lista på alla set");
            System.out.println("5. välja ett set");
            System.out.println("6. Boka");
            System.out.println("7. Avsluta uthyrning");
            System.out.println("8. Summera intäkter");
            System.out.println("9. Avsluta");

            int choice = scanner.nextInt();

            if(choice == 9){
                System.out.println("Tack och välkommen åter!");
                scanner.nextLine();
                run = false;
            }

        }



    }
}