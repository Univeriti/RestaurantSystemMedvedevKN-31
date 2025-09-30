public class Bill {
    private String id;
    private Order order;
    private double amount;
    private String status;

    public Bill() {
        this.id = "B-000";
        this.order = null;
        this.amount = 0.0;
        this.status = "розраховано";
    }

    public Bill(String id, Order order, double amount, String status) {
        this.id = id;
        this.order = order;
        this.amount = amount;
        this.status = status;
    }

    public String toString() {
        return "Рахунок: " + id + ", сума: " + amount + ", статус: " + status;
    }
}

