public class largest_element {

    public static int findLargestElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int maxElement = array[0]; // Assume the first element is the maximum

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 6};
        int largestElement = findLargestElement(array);

        System.out.println("The largest element is: " + largestElement);
    }
}
