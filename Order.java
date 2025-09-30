import java.util.List;
import java.util.ArrayList;

public class Order {
    private String id;
    private String clientId;
    private List<Dish> items;
    private double total;
    private String status;

    public Order() {
        this.id = "O-000";
        this.clientId = "";
        this.items = new ArrayList<>();
        this.total = 0.0;
        this.status = "новое";
    }

    public Order(String id, String clientId, List<Dish> items, double total, String status) {
        this.id = id;
        this.clientId = clientId;
        this.items = items != null ? items : new ArrayList<>();
        this.total = total;
        this.status = status;
    }

    public String toString() {
        return "Замовлення: " + id + ", клієнт: " + clientId + ", позицій: " + items.size() + ", сума: " + total;
    }
}
