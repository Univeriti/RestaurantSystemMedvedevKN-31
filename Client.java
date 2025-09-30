import java.util.ArrayList;
import java.util.List;

public class Client {
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private List<Order> orderHistory;
    private int loyaltyPoints;
    private String notes;

    public Client() {
        this.id = "C-000";
        this.firstName = "Не вказано";
        this.lastName = "";
        this.phone = "";
        this.email = "";
        this.orderHistory = new ArrayList<>();
        this.loyaltyPoints = 0;
        this.notes = "";
    }

    public Client(String id, String firstName, String lastName, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.orderHistory = new ArrayList<>();
        this.loyaltyPoints = 0;
        this.notes = "";
    }

    public void placeOrder(Order order) {}
    public void payBill(Bill bill) {}
    public void leaveReview(String text) {}

    @Override
    public String toString() {
        return "Клієнт: " + firstName + " " + lastName +
                " (id=" + id + ")\n" +
                "Контакти: " + phone + " / " + email + "\n" +
                "Замовлень: " + orderHistory.size() + "\n" +
                "Бали лояльності: " + loyaltyPoints;
    }
}
