import com.company.Tribe;

public class Runner {

    public static void main(String[] args) {
        Tribe[] tribes = {
                new Tribe("Radimichi", 7200, true),
                new Tribe("Vyatichi", 4500, false),
                new Tribe("Northerners", 2200, true),
                new Tribe("Krivichi", 1600, false),
                new Tribe("Volynians", 5600, true),
                new Tribe("Drevlyans", 3400, true),
                new Tribe("Glade", 960, false),
                new Tribe("Dregovichi", 8100, true),
                new Tribe(),
                null,
        };

        int totalNumber = 0;
        int familiarWithFire = 0;

        for (Tribe tribe : tribes) {
            if (tribe != null) {
                totalNumber += tribe.getNumber();
                if (tribe.getFamiliarityWithFire()) {
                    familiarWithFire += 1;
                }
            }
        }

        for (Tribe tribe : tribes) {
            System.out.println(tribe);
        }

        System.out.println("______________________");
        System.out.println("Total number: " + totalNumber);
        System.out.println("Familiar with fire: " + familiarWithFire);
    }
}