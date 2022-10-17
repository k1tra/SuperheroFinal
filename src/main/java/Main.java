import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // databaseobjekt oprettes
        Database database = new Database();

        Scanner sc = new Scanner(System.in);
        System.out.println("Hej og velkommen til programmet. Hvad vil du?");


        int valg;
        Boolean isHuman = null;

        do {
            System.out.println("1. Opret superhelt");
            System.out.println("5. Se listen over dine superhelte");
            System.out.println("9. Afslut programmet");


            valg = sc.nextInt();
            if (valg == 1) {

                System.out.println("Hvad er dens navn?");
                // STADIG PROBLEMER MED nextLine som antager værdien af den næste angivet String -- SPØRG ZACG
                String navn = sc.next();
                System.out.println("Hvad er dens superheltenavn?");
                String superheroname = sc.next();

                //
                System.out.println("Er superhelten et menneske? yes/no");
                String svar=sc.next();
                switch(svar){
                    case "yes":
                        isHuman = true;
                        break;
                    case "no":
                        isHuman=false;
                        break;
                    default:
                        System.out.println("Switch-case passed to default state.");
                }
                System.out.println("I hvad år er den lavet?");
                int creationyear = sc.nextInt();
                System.out.println("Hvor stærk er den? angiv i tal");
                double strength = sc.nextDouble();
                System.out.println("Okay! Din superhelt er kreeret");
                database.createSuperhero(navn, superheroname, isHuman, creationyear, strength);
            } else if (valg==5) {
                System.out.println("Din liste over superhelte ser således ud:");
                for(Superhero superheroes : database.superheroes){
                    System.out.println("Rigtige navn: "+superheroes.getName());
                    System.out.println("Superheltenavn: "+superheroes.getSuperheroName());
                    // LØST MED EN IF ELSE, ER DER MON EN ANDEN GOD MÅDE AT GØRE DET PÅ?
                        if(isHuman!=true){
                            System.out.println("Er menneske: Nej");
                        } else{
                            System.out.println("Er menneske: Ja");
                        }
                    System.out.println("Superhelten er lavet i år: "+superheroes.getCreationYear());
                    System.out.println("Superheltens styrke er: "+superheroes.getStrength());
                    System.out.println(" ");
                }
            }else if(valg==9){
                System.out.println("Programmet afsluttes.");
            }
        } while (valg == 1 || valg == 5);


    }
}
