package exercise.pac.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Asus Vivobook", 8000000);
        System.out.println(product.name);
        System.out.println(product.price);

        System.out.println(product);

        Product product2 = new Product("Asus Vivobook", 8000000);
        System.out.println(product.equals(product2));

        System.out.println(product.hashCode()==product2.hashCode());
    }
}