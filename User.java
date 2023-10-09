public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;

    public User(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public User(Long id, String firstName, String lastName, String phone) {
        this(firstName, lastName, phone);
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("Идентафикатор: %s Имя: %s, Фамилия: %s Телефон:%s%n", id, firstName, lastName, phone);
    }
}