import java.util.*;

 class CommonElementsInArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 4, 5, 6, 7};

        Set<Integer> commonElements = new HashSet<>();
        for (int num : array1) {
            if (contains(array2, num)) {
                commonElements.add(num);
            }
        }

        System.out.println("Common elements: " + commonElements);
    }

    // Helper method to check if an array contains a specific element
    private static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
