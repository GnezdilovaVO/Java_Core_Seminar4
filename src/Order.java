import java.util.List;

public class Order {
    Customer customer;
    Product product;
    int count;
    public Order(Customer customer, Product product, int count) {
        this.customer = customer;
        this.product = product;
        this.count = count;
    }
    public static Order shopping(Customer customer, Product product, int count,
                                 List<Customer> customers, List<Product> products) throws CountException,
            ProductException, CustomerException {
        try{
            if(!customers.contains(customer)) {
                throw new CustomerException("Нет такого покупателя");
            }
            if(!products.contains(product)){
                throw new ProductException("Нет такого продукта");
            }
            if(count < 0 || count > 100) {
                throw new CountException("Неверное количество товара");
            }
            return new Order(customer, product, count);
        }catch (CustomerException | ProductException | CountException e) {
            e.getMessage();
        }
        return null;
    }
    public static int countOrder(List<Order> orders) {
        try{
            int countOrder = 0;
            for (Order order : orders) {
                if (order != null) {
                    countOrder++;
                }
            }
            return countOrder;
        } catch (NullPointerException e) {
            e.getMessage();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", product=" + product +
                ", count=" + count +
                '}';
    }
}
