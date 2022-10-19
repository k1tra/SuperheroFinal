import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Database {
    ArrayList<Superhero> superheroes = new ArrayList<>();

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
            if (superhero.getName().toLowerCase().contains(search.toLowerCase())) {
                System.out.println("Superhelten er fundet: "+superhero.getName()+superhero.getSuperheroName()+superhero.getIsHuman()+superhero.getCreationYear()+superhero.getStrength());
                break;

            } if(!found){
                System.out.println("Kunne ikke finde superhelten");

            }

        }

    }
}
