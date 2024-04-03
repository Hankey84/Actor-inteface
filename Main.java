import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Создаем магазин
        Market market = new Market();

        // Создаем список акторов (покупателей)
        List<Actor> customers = new ArrayList<>();

        customers.add(new Human("Маша"));
        customers.add(new Human("Иван"));
        customers.add(new Human("Александр"));
        customers.add(new Human("Татьяна"));
        customers.add(new Human("Родион"));

        
        for (Actor customer : customers) {
            // Принимаем покупателей в магазин
            market.acceptToMarket(customer);
            // Помещаем покупателей в очередь (можно сделать отдельным циклом, но смысл?)
            market.takeInQueue(customer);
        }
        // Периодически обновляем состояние магазина
        market.update();
        
        // Освобождаем покупателей из очереди, принимаем от них заказы и выдаём их
        market.takeOrders();
        market.giveOrders();
        market.update();

        market.takeOrders();
        market.giveOrders();
        market.update();

        market.takeOrders();
        market.giveOrders();
        market.update();

        // Выходим из магазина
        market.releaseFromMarket(customers);
    }
}
