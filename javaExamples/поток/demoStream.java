package поток;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * demoStream
 */
public class demoStream {

    public static void main(String[] args) {
        List<SeaCreature> seaCreatures = new ArrayList();
        seaCreatures.add(new SeaCreature(300, "Лошадь", new Species("Лошади", 1000000)));
        seaCreatures.add(new SeaCreature(400, "Верблюд", new Species("Верблюды", 1000000)));
        seaCreatures.add(new SeaCreature(500, "Лось", new Species("Лоси", 1000000)));
        seaCreatures.add(new SeaCreature(2, "Мышь", new Species("Грызуны", 1000000000)));
        seaCreatures.add(new SeaCreature(3, "Крыса", new Species("Грызуны", 1000000000)));
        printSpecies1(seaCreatures);
        printSpecies2(seaCreatures);

    }

    public static void printSpecies1(List<SeaCreature> seaCreatures) {
        Set<Species> speciesSet = new HashSet<>();
        for (SeaCreature sc : seaCreatures) {
            if (sc.getWeight() >= 10)
                speciesSet.add(sc.getSpecies());
        }
        List<Species> sortedSpecies = new ArrayList<>(speciesSet);
        Collections.sort(sortedSpecies, new Comparator<Species>() {
            public int compare(Species a, Species b) {
                return Integer.compare(a.getPopulation(), b.getPopulation());
            }
        });
        for (Species s : sortedSpecies)
            System.out.println(s.getName());
    }

    public static void printSpecies2(List<SeaCreature> seaCreatures) {
        seaCreatures.stream()
                .filter(sc -> sc.getWeight() >= 10)
                .map(SeaCreature::getSpecies)
                .distinct()
                .sorted(Comparator.comparing(Species::getPopulation))
                .map(Species::getName)
                .forEach(System.out::println);
    }
}