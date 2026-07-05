public class binarySearch {

    public static int binarySearch(int array[], int key) {

        int start = 0, end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 23, 24, 34, 56, 67 };
        int key = 57;

        int found = binarySearch(array, key);

        if (found == -1) {
            System.out.println("Key not Found!");
        } else {
            System.out.println("Key found at index: " + found);
        }

    }
}
