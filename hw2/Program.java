import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<String> queue;
    private List<String> orders;

    public Program() {
        this.queue = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addPersonToQueue(String person) {
        queue.add(person);
    }

    public void removePersonFromQueue(String person) {
        queue.remove(person);
    }

    public String getNextPersonInQueue() {
        if (!queue.isEmpty()) {
            return queue.get(0);
        } else {
            return null;
        }
    }

    public void placeOrder(String order) {
        orders.add(order);
    }

    public String getNextOrder() {
        if (!orders.isEmpty()) {
            return orders.get(0);
        } else {
            return null;
        }
    }

    public void removeOrder(String order) {
        orders.remove(order);
    }

    public void update() {
        String nextPerson = getNextPersonInQueue();
        String nextOrder = getNextOrder();

        if (nextPerson != null && nextOrder != null) {
            System.out.println("Person " + nextPerson + " is placing order: " + nextOrder);
            removePersonFromQueue(nextPerson);
            removeOrder(nextOrder);
            System.out.println("Order " + nextOrder + " is ready for " + nextPerson);
        } else if (nextPerson != null) {
            System.out.println("Person " + nextPerson + " is waiting for an order");
        } else if (nextOrder != null) {
            System.out.println("No one is waiting for order " + nextOrder);
        }
    }

    public static void main(String[] args) {
        Program market = new Program();
        market.addPersonToQueue("John");
        market.addPersonToQueue("Alice");
        market.placeOrder("Pizza");
        market.placeOrder("Burger");
        market.update();
    }
}