import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.logging.SocketHandler;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Database {
    ArrayList<Superhero> superheroes = new ArrayList<>();
    Scanner sc2 = new Scanner(System.in);

    // createSuperHero
    public void createSuperhero(String name, String superheroname, boolean isHuman, int creationYear, double strength) {
        Superhero superhero = new Superhero(name, superheroname, isHuman, creationYear, strength);
        superheroes.add(superhero);
        // System.out.println(superheroes);

    }

    // Hvordan laver man denne metode? =)
    public void searchSuperhero(String search) {
        Boolean found = false;

        for (Superhero superhero : superheroes) {
            if (superhero.getName().toLowerCase().contains(search.toLowerCase()) || superhero.getSuperheroName().toLowerCase().contains(search.toLowerCase())) {
                System.out.println("Superhelten er fundet.");
                System.out.println("Navn: "+superhero.getName());
                System.out.println("Superhelte navn: "+ superhero.getSuperheroName());
                if(superhero.getIsHuman()==true){
                    System.out.println("Er menneske: ja");
                }else{
                    System.out.println("Er menneske: nej");
                }
                System.out.println("Skabt i år: "+ superhero.getCreationYear());
                System.out.println("Styrke: "+ superhero.getStrength());
                System.out.println(" ");
                System.out.println("Would you like to edit this hero?");
                System.out.println("1: Ja");
                System.out.println("2: Nej");
                Superhero hero = superhero;
                found = true;
                int valg2 = sc2.nextInt();
                if (valg2 == 1) {
                    searchEditHero(hero);
                    break;
                } else if (valg2 == 2) {
                    //found = true;
                    break;
                }

            }

        }if (found!=true) {
            System.out.println("Kunne ikke finde superhelten");

        }
    }

    public void searchEditHero(Superhero superhero) {
        System.out.println("Hvilke oplysninger vil du gerne ændre?");
        System.out.println("1. Navn");
        int valg3 = sc2.nextInt();
        switch(valg3){
            case 1:
                System.out.println("Navnet er indtil videre " + superhero.getName());
                System.out.println("Indtast hvad du gerne vil opdatere det til: ");
                String name = sc2.next();
                superhero.setName(name);
                System.out.println("Din helts navn er blevet opdateret og det er nu ændret til " + superhero.getName());
            case 2:
                System.out.println("Superheltenavnet er indtil videre "+superhero.getSuperheroName());
                System.out.println("Indtast superheltenavnet du gerne vil opdatere det til");
               String superheroname = sc2.next();
               superhero.setSuperheroname(superheroname);
            case 3:
                if(superhero.getIsHuman()==true){
                    System.out.println("Er menneske: ja");
                }else{
                    System.out.println("Er menneske: nej");
                }
                System.out.println("Er det et menneske? ja/nej");
                String svarIsHuman = sc2.next();
                if(svarIsHuman=="ja"){
                    superhero.setHuman(true);
                }else if(svarIsHuman=="nej"){
                    superhero.setHuman(false);
                }
            case 4:
                System.out.println("Din helt blev skabt i år "+superhero.getCreationYear());
            case 5:
                System.out.println("Din helts styrke er "+superhero.getStrength());
        }
        if (valg3 == 1) {
            System.out.println("Navnet er indtil videre " + superhero.getName());
            System.out.println("Indtast hvad du gerne vil opdatere det til: ");
            String name = sc2.next();
            superhero.setName(name);
            System.out.println("Din helts navn er blevet opdateret og det er nu ændret til " + superhero.getName());
        }

    }

    public void editHero(String search) {
        boolean found = false;
        for (Superhero superhero : superheroes) {
            do {
                if (superhero.getName().toLowerCase().contains(search.toLowerCase()) || superhero.getSuperheroName().toLowerCase().contains(search.toLowerCase())) {
                    found = true;
                    System.out.println("Superhelten eksisterer på din liste.");
                    System.out.println("Du kan ændre i følgende oplysninger.");
                    System.out.println("1: " + superhero.getName());
                    System.out.println("2: " + superhero.getSuperheroName());
                    System.out.println("3: " + superhero.getIsHuman());
                    System.out.println("4: " + superhero.getCreationYear());
                    System.out.println("5: " + superhero.getStrength());
                    System.out.println("Hvad vil du gerne ændre? Tryk på det korresponderende tal for at ændre.");
                    System.out.println("Tryk på 9 for at komme tilbage til menuen");
                    int valg = sc2.nextInt();
                    if (valg == 1) {
                        System.out.println("Indtast nyt navn");
                        String name = sc2.next();
                        superhero.setName(name);
                    } else if (valg == 2) {
                        System.out.println("Indtast nyt superheltenavn");
                        String heroname = sc2.next();
                        superhero.setSuperheroname(heroname);

                    } else if (valg == 3) {
                        System.out.println("Nå, var det ikke et menneske alligevel? ja/nej");
                        String isHumanSvar;
                        isHumanSvar = sc2.next();
                        boolean isHuman;
                        switch(isHumanSvar){
                            case "ja":
                                isHuman = true;
                                superhero.setHuman(isHuman);
                                break;
                            case "nej":
                                isHuman = false;
                                superhero.setHuman(isHuman);
                                break;
                            default:
                                System.out.println("Dette var ikke et gyldigt svar. Ændring ikke foretaget.");
                        }

                    } else if (valg == 4) {
                        System.out.println("Indtast det nye år hvori helten blev skabt");
                        int creationYear = sc2.nextInt();
                        superhero.setCreationYear(creationYear);
                    } else if (valg == 5) {
                        System.out.println("Indtast den nye styrke");
                        double strength = sc2.nextDouble();
                        superhero.setStrength(strength);
                    } else if (valg == 9) {
                        break;
                    }
                } else if (found == false) {
                    System.out.println("En helt med dette navn fandtes ikke");
                }
            } while (found == true);
        }

    }
}

