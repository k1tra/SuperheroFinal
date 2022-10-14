import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // databaseobjekt oprettes
        Database database = new Database();

         Scanner sc = new Scanner(System.in);


        int valg;

        do {
            System.out.println("Hej og velkommen til programmet. Hvad vil du?");
            System.out.println("1. Opret superhelt");
            System.out.println("9. Afslut programmet");
            valg = sc.nextInt();
            if (valg == 1) {

                System.out.println("Hvad er dens navn?");
                String navn = sc.next();
                System.out.println("Hvad er dens superheltenavn?");
                String superheroname = sc.next();

                //
                System.out.println("Er superhelten et menneske? true/false");
                Boolean isHuman = sc.nextBoolean();
                System.out.println("I hvad år er den lavet?");
                int creationyear = sc.nextInt();
                System.out.println("Hvor stærk af er den? angiv i tal");
                double strength = sc.nextDouble();
                System.out.println("Okay! Din superhelt er kreeret");
                database.createSuperhero(navn, superheroname, isHuman, creationyear, strength);
            } else if (valg == 9) {
                System.out.println("Programmet afsluttes");
            }
        }while(valg==1);


    }
}
