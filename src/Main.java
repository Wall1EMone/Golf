import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.DuplicateFormatFlagsException;
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

            switch(choice) {
                case 1:
                    while (true) {
                        try {
                            System.out.print("Namn: ");
                            String name = scanner.nextLine();

                            System.out.print("Efternamn: ");
                            String lastName = scanner.nextLine();

                            System.out.println("Handikapp: ");
                            double hcp = scanner.nextDouble();
                            scanner.nextLine();

                            int id = members.size() + 1; // Id baserad på antal medlemmar i listan och siffran på iden går upp åt.
                            Member member = new Member(name, lastName, true, id, "brons", new ArrayList<>(), hcp);
                            members.add(member);
                            member.addHistory("Medlem skapad: " + name + " " + lastName);

                            System.out.println("Medlem skapad!");
                            System.out.println("Namn: " + name);
                            System.out.println("Efternamn: " + lastName);
                            System.out.println("ID: " + id);
                            System.out.println();

                            break;
                        } catch (Exception e) {
                            System.out.println("Skriv namn och efternamn med bokstäver och handikapp med siffra!");
                            System.out.println();
                            scanner.nextLine();
                        }

                    }
                    break;

                case 2:
                    while (true) {
                        try {
                            System.out.print("Skriv in ID nummer: ");
                            int idNum = scanner.nextInt();
                            //Kollar om id finns i listan och skriver ut info om true
                            boolean found2 = false;
                            for (Member m : members) {
                                if (m.getId() == idNum) {
                                    m.info();
                                    System.out.println();
                                    found2 = true;
                                    break;
                                }
                            }
                            if (!found2) {
                                System.out.println("Du är inte medlem!");
                                continue;// Så att det går tillbaka i början utan att gå till meny
                            }
                            break;//Bryta sig ut while loop när det hittat

                        } catch (Exception e) {
                            System.out.println("Fel: Skriv ditt id i tal!");
                            scanner.nextLine();
                        }
                    }
                    break;

                case 3:
                    while (true) {
                        try {
                            System.out.print("Skriv in ID på den du vill ändra: ");
                            int id3 = scanner.nextInt();
                            scanner.nextLine();

                            boolean found3 = false;

                            for (Member m3 : members) {
                                if (m3.getId() == id3) {
                                    System.out.print("Nytt namn: ");
                                    String name3 = scanner.nextLine();

                                    System.out.print("Nytt Efternamn: ");
                                    String lastName3 = scanner.nextLine();

                                    System.out.println("Nytt handikapp: ");
                                    double hcp3 = scanner.nextDouble();

                                    m3.addHistory("Ändring: " + name3 + " " + lastName3);

                                    m3.setName(name3);
                                    m3.setLastname(lastName3);
                                    m3.setHcp(hcp3);

                                    System.out.println("Nytt namn: " + name3);
                                    System.out.println("nytt efternamn: " + lastName3);
                                    System.out.println("Nytt handikapp: " + hcp3);
                                    System.out.println();

                                    found3 = true;
                                    break;

                                }
                            }
                            if(found3){
                                break;
                            }

                        } catch (Exception e) {
                            System.out.println("Fel: Skriv ditt id i tal!");
                            scanner.nextLine();
                        }
                    }break;


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