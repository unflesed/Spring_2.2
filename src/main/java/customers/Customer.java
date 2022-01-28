package customers;

import lombok.Data;

@Data
public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private boolean order;

    public Customer(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void init(){
        setOrder(true);
    }
}
