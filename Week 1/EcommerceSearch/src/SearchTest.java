public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Phone", 20000),
                new Product(2, "Laptop", 50000),
                new Product(3, "Tablet", 30000),
                new Product(4, "Watch", 10000),
                new Product(5, "Speaker", 5000)
        };

        System.out.println("Searching for Product ID: 3 \n");

        LinearSearch.search(products, 3);
        BinarySearch.search(products, 3);

        System.out.println("\nSearching for Product ID: 10 \n");

        LinearSearch.search(products, 10);
        BinarySearch.search(products, 10);
    }
}