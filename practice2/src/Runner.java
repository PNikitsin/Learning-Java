import by.gsu.asolib.Material;
import by.gsu.asolib.Subject;

public class Runner {
    public static void main(String[] args) {
        Material steel = new Material("Steel", 7850);
        Subject wire = new Subject("Wire", steel, 0.03);
        System.out.println(wire);

        wire.setMaterial(new Material("Cooper", 8500));
        System.out.println(wire);

        wire.setMaterial(steel);
        System.out.println(wire);
    }
}