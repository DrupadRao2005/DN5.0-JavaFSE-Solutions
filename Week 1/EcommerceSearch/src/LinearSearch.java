public class LinearSearch {

    public static int search(Product[] products, int targetId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == targetId) {
                System.out.println("Linear Search: Found at index " + i);
                return i;
            }
        }
        System.out.println("Linear Search: Not found");
        return -1;
    }
}