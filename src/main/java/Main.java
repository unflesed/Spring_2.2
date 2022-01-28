import customers.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        Customer customer1 = ctx.getBean("customer1", Customer.class);
        Customer customer2 = ctx.getBean("customer2", Customer.class);

        System.out.println(customer1);

        System.out.println(ctx.getBean("map"));
    }
}
