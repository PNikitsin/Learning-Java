import by.gsu.pms.BusinessTrip;

public class Runner {
    public static void main(String[] args) {
        // create an array of 7 objects
        BusinessTrip[] businessTrips = {
                new BusinessTrip("Илья Виталиевич", 20000, 3),
                new BusinessTrip("Владислав Петрович", 35000, 4),
                new BusinessTrip("Даниил Михайлович", 70000, 6),
                new BusinessTrip("Лаврентий Сергеевич", 100000, 9),
                new BusinessTrip(),
                null,
                new BusinessTrip("Феликс Иванович",122000, 10),
        };
    }
}