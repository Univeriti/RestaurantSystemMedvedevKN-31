public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String role;
    private String phone;
    private String email;
    private String schedule;
    private String status;

    public Employee() {
        this.id = "E-000";
        this.firstName = "Не вказано";
        this.lastName = "";
        this.role = "Працівник";
        this.phone = "";
        this.email = "";
        this.schedule = "";
        this.status = "активний";
    }

    public Employee(String id, String firstName, String lastName, String role, String phone, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.phone = phone;
        this.email = email;
        this.schedule = "";
        this.status = "активний";
    }

    public void work() {}
    public void takeOrder() {}
    public void manage() {}

    @Override
    public String toString() {
        return "Працівник: " + firstName + " " + lastName +
                " (" + role + ")\n" +
                "id=" + id + ", статус: " + status;
    }
}
