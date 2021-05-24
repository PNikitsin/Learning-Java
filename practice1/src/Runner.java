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

        // print the array content to the console, using show() method
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                businessTrip.show();
                System.out.println();
            }
        }

        // change the employee`s transportaion expenses for the last object of the array
        businessTrips[6].setTransportExpenses(150000);
        System.out.println(businessTrips[6]);

        // print the duration of two initial business trips by the single operator
        System.out.println("Duration: " + (businessTrips[1].getDays() + businessTrips[0].getDays()));

        // print the array content to the console (one element per line), using toString( ) method implicitly
        for (BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }

        // find the sum of total expenses
        int sumExpenses = 0;
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null && businessTrip.getTotal() > sumExpenses) {
                sumExpenses = businessTrip.getTotal();
            }
        }

        // find and print account name employee’s with maximum total expenses
        System.out.println("Sum expenses: " + sumExpenses);
    }
}