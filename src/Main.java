import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CustomerException, CountException, ProductException {
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer("Jhon", "Elton", "+79635487501");
        Customer customer2 = new Customer("Harry", "Potter", "+79834567898");
        Customer customer3 = new Customer("Sherlock", "Holms", "+79245632141");
        Customer customer4 = new Customer("ELvis", "Presli", "+79625364565");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Sweater", 75);
        Product product2 = new Product("hudi", 50);
        Product product3 = new Product("skirt", 60);
        products.add(product1);
        products.add(product2);
        products.add(product3);

        List<Order> orders = new ArrayList<>();
        Customer wrongCustomer = new Customer("Steve", "Jein", "+75362412030");
        Product wrongProduct= new Product("t-shirt", 50);
        orders.add(Order.shopping(customer1, product1, 101, customers, products));
        orders.add(Order.shopping(customer2, wrongProduct, 5, customers, products));
        orders.add(Order.shopping(wrongCustomer, product3, 5, customers, products));
        orders.add(Order.shopping(customer3, product2, 5, customers, products));
        System.out.println("Количество заказов: " + Order.countOrder(orders));

    }
}