import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Member> members = new ArrayList<>();
        boolean run = true;

        while(run){
            System.out.println("Välkommen till Mones golfshop");
            System.out.println("Gör ditt val");
            System.out.println();
            System.out.println("1. Skapa medlem");
            System.out.println("2. Söka medlem");
            System.out.println("3. Ändra medlem");
            System.out.println("4. Lista på alla set");
            System.out.println("5. välja ett set");
            System.out.println("6. Boka");
            System.out.println("7. Avsluta uthyrning");
            System.out.println("8. Summera intäkter");
            System.out.println("9. Avsluta");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Namn: ");
                    String name = scanner.nextLine();

                    System.out.print("Efternamn: ");
                    String lastName = scanner.nextLine();

                    System.out.println("Handikapp: ");
                    double hcp = scanner.nextDouble();
                    scanner.nextLine();

                    int id = members.size() + 1; // Id baserad på antal medlemmar i listan och siffran på iden går upp åt.
                    Member member = new Member(name, lastName, true, id, "brons",new ArrayList<>(), hcp);
                    members.add(member);
                    member.addHistory("Medlem skapad: " + name + " " + lastName);

                    System.out.println("Medlem skapad!");
                    System.out.print("Namn: " + name);
                    System.out.println("Efternamn: " + lastName);
                    System.out.println("ID: " + id);

                    break;

                case 9:
                    System.out.println("Välkommen åter!");
                    run = false;
                    break;
                default:
                    System.out.println("Skriva ett tal 1-10");
            }


        }



    }
}