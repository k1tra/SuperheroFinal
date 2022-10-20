import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.logging.SocketHandler;
import java.util.Scanner;

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
            if (superhero.getName().toLowerCase().contains(search.toLowerCase()) || superhero.getSuperheroName().toLowerCase().contains(search.toLowerCase())){
                System.out.println("Superhelten er fundet: " + superhero.getName() + superhero.getSuperheroName() + superhero.getIsHuman() + superhero.getCreationYear() + superhero.getStrength());
                System.out.println(" ");
                System.out.println("Would you like to edit this hero?");
                System.out.println("1: No");
                System.out.println("2: Yes");
                int valg2 = sc2.nextInt();
                if (valg2==2){
                    editHero(superhero);
                    break;
                }else if(valg2==1){
                    break;
                }

            }
            if (!found) {
                System.out.println("Kunne ikke finde superhelten");

            }

        }
    }

    public void editHero(Superhero superhero){
        System.out.println("Den passede den videre til editHero og editHero blev kaldet");

        }
    }

