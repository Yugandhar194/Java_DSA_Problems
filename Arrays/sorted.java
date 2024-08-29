public class sorted {

    public static boolean isSorted(int[] array) {
        if (array == null || array.length <= 1) {
            // An array with 0 or 1 element is considered sorted
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false; // Array is not sorted
            }
        }

        return true; // Array is sorted
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] unsortedArray = {5, 2, 9, 1, 7, 6};

        System.out.println("Is sortedArray sorted? " + isSorted(sortedArray));
        System.out.println("Is unsortedArray sorted? " + isSorted(unsortedArray));
    }
}
