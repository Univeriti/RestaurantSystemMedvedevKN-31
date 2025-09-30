import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String id;
    private String name;
    private List<Dish> dishes;
    private String lastUpdated;

    public Menu() {
        this.id = "M-000";
        this.name = "Основне меню";
        this.dishes = new ArrayList<>();
        this.lastUpdated = "";
    }

    public Menu(String id, String name) {
        this.id = id;
        this.name = name;
        this.dishes = new ArrayList<>();
        this.lastUpdated = "";
    }

    public void addDish(Dish dish) {}
    public void removeDish(String dishId) {}
    public void updateDish(Dish dish) {}

    @Override
    public String toString() {
        return "Меню: " + name + " (id=" + id + ")\n" +
                "Кількість страв: " + dishes.size();
    }
}
