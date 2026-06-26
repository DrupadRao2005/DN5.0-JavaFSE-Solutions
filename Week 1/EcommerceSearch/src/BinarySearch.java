public class BinarySearch {

    public static int search(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midId = products[mid].getId();

            if (midId == targetId) {
                System.out.println("Binary Search: Found at index " + mid);
                return mid;
            } else if (midId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Binary Search: Not found");
        return -1;
    }
}