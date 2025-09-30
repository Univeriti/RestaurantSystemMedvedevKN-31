public class Dish {
    private String id;
    private String name;
    private String category;
    private String description;
    private double price;
    private int prepTime;
    private boolean available;

    public Dish() {
        this.id = "D-000";
        this.name = "Невідомо";
        this.category = "";
        this.description = "";
        this.price = 0.0;
        this.prepTime = 0;
        this.available = true;
    }

    public Dish(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.category = "";
        this.description = "";
        this.price = price;
        this.prepTime = 0;
        this.available = true;
    }

    public void cook() {}
    public void updateAvailability(boolean status) {}

    @Override
    public String toString() {
        return "Страва: " + name + " (id=" + id + ")\n" +
                "Ціна: " + price + ", доступна: " + available;
    }
}
