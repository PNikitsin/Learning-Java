package by.gsu.pms;

public class Runner {

    public static void main(String[] args) {
        Cost[] costs = {
                new Cost("Gregory", 20, 4),
                new Cost("Stanislav", 60, 20),
                null,
                new Cost("Anton", 42, 6),
                new Cost("Alexander", 15, 3),
                new Cost("Alexei", 90, 30),
                new Cost(),
        };

        for (Cost cost : costs) {
            if (cost != null) {
                cost.show();
            }
        }

        costs[costs.length - 1].setTransport(5);

        System.out.println("Duration = " + (costs[0].getDays() + costs[1].getDays()));

        for (Cost cost : costs) {
            System.out.println(cost);
        }

        int sum = 0;
        for (Cost cost : costs) {
            if (cost != null) {
                sum += cost.getTotal();
            }
        }
        System.out.println("Total expenses = " + sum);

        int maxTotal = 0;
        String account = "";
        for (Cost cost : costs) {
            if (cost != null && cost.getTotal() > maxTotal) {
                account = cost.getAccount();
            }
        }
        System.out.println(account);
    }
}
