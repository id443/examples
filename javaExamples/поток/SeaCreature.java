package поток;

public class SeaCreature {
    int Weight;
    String Name;
    Species species;

    SeaCreature(int Weight,
    String Name,
    Species species){
        this.Weight = Weight;
        this.Name = Name;
        this.species = species;
    }
    void setWeight(int Weight){
            this.Weight = Weight;
    }

    int getWeight() {
        return this.Weight;
    }

    Species getSpecies(){
        return this.species;
    }
}
