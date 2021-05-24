import com.company.Deserializer;
import com.company.MyException;
import com.company.Serializer;
import com.company.Tribe;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws MyException {
        final String TEXT_CSV = "src/text.scv";

        try (Scanner scanner = new Scanner(new FileReader(TEXT_CSV))) {
            int totalNumber = 0;
            int familiarWithFire = 0;
            final int MAX = 10;
            Tribe[] tribes = new Tribe[MAX];

            for (int i = 0; i < MAX; i++) {
                try {
                    tribes[i] = new Tribe(scanner);
                }
                catch (Exception e) {
                    tribes[i] = new Tribe();
                    throw new MyException();
                }
            }

            for (Tribe tribe : tribes) {
                System.out.println(tribe);
            }

            for (Tribe tribe : tribes) {
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

            final String DAT_FILE = "src/text.dat";

            System.out.println("......................");

            Serializer.serialize(tribes, DAT_FILE);
            tribes = Deserializer.deserialize(DAT_FILE);

            for (Tribe tribe : tribes) {
                System.out.println(tribe);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}