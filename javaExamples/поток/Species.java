package поток;

public class Species {
    String Name;
    Integer Population;

    Species(String Name,
    Integer Population){
        this.Name = Name;
        this.Population = Population;
    }

    String getName(){
        return this.Name;
    }

    Integer getPopulation(){
        return this.Population;
    }


}
