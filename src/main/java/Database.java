import java.util.ArrayList;
import java.util.ArrayList;


public class Database {
    ArrayList<Superhero> superheroes = new ArrayList<>();

    // createSuperHero
    public void createSuperhero(String name, String superheroname, boolean isHuman, int creationYear, double strength){
        Superhero superhero = new Superhero(name,superheroname,isHuman,creationYear,strength);
        superheroes.add(superhero);
        System.out.println(superheroes);
    }
}
