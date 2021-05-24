import com.company.Tribe;
import java.util.ArrayList;
import java.util.Comparator;

public class Runner {

    public static void main(String[] args) {
        ArrayList<Tribe> tribeArrayList = new ArrayList<Tribe>();
        tribeArrayList.add(new Tribe("Dregovichi", 8100, true));
        tribeArrayList.add(new Tribe("Radimichi", 7200, true));
        tribeArrayList.add(new Tribe("Vyatichi", 4500, false));
        tribeArrayList.add(new Tribe("Drevlyans", 3400, true));
        tribeArrayList.add(new Tribe("Northerners", 8100, true));
        tribeArrayList.add(new Tribe("Krivichi", 1600, false));
        tribeArrayList.add(new Tribe("Volynians", 5600, true));
        tribeArrayList.add(new Tribe("Glade", 8100, false));
        tribeArrayList.add(new Tribe());
        tribeArrayList.add(null);

        while (tribeArrayList.contains(null)) {
            tribeArrayList.remove(null);
        }

        tribeArrayList.sort(Comparator.comparing(Tribe::getNumber).thenComparing(Tribe::getName));

        for (int i = 0; i < 3; i++) {
            for (Tribe tribe : tribeArrayList) {
                System.out.println(tribe);
            }
        }

        int totalNumber = 0;
        int familiarWithFire = 0;

        for (Tribe tribe : tribeArrayList) {
            if (tribe != null) {
                totalNumber += tribe.getNumber();
                if (tribe.familiarityWithFire()) {
                    familiarWithFire += 1;
                }
            }
        }

        System.out.println("______________________");
        System.out.println("Total number: " + totalNumber);
        System.out.println("Familiar with fire: " + familiarWithFire);
    }
}