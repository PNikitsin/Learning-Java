import com.company.Tribe;
import java.util.ArrayList;

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
    }
}