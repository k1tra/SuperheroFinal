public class Superhero {
    private String name;
    private String superheroname;
    private boolean isHuman;
    private int creationYear;
    private double strength;

    public Superhero(String name, String superheroname, boolean isHuman, int creationYear, double strength){
        this.name=name;
        this.superheroname=superheroname;
        this.isHuman=isHuman;
        this.creationYear=creationYear;
        this.strength=strength;
    }


    // GETTERS
    public String getName(){
        return name;
    }
    public String getSuperheroName(){
        return superheroname;
    }
    public boolean getIsHuman(){
        return isHuman;
    }
    public int getCreationYear(){
        return creationYear;
    }
    public double getStrength(){
        return strength;
    }

    /*public String toString(){
        return ("Superhelten er "+name+superheroname+isHuman+creationYear+strength);
    }*/
}
