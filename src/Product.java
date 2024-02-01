public class Product {
    String nameProduct;
    int costProduct;

    public Product(String nameProduct, int costProduct) {
        this.nameProduct = nameProduct;
        this.costProduct = costProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", costProduct=" + costProduct +
                '}';
    }
}
