public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("C-001", "Іван", "Петренко", "123456789", "ivan@gmail.com");
        Employee e1 = new Employee("E-001", "Олена", "Коваленко", "Офіціант", "987654321", "olena@gmail.com");
        Dish d1 = new Dish("D-001", "Борщ", 120.0);
        Menu m1 = new Menu("M-001", "Зимове меню");

        System.out.println(c1.toString());
        System.out.println();
        System.out.println(e1.toString());
        System.out.println();
        System.out.println(d1.toString());
        System.out.println();
        System.out.println(m1.toString());
    }
}
