public class SortService {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            // find the right place for ith element
            int need_a_home = array[i];

            // the 0ths item to the (i-1)th items are already sorted
            for (int j = 0; j < i - 1; j++) {
                if (array[i] < array[i - 1]) {
                    array = swap(i, i - 1, array);
                }
            }

        }
        return array;
    }

    // TODO: is new memory being allocated for an array passed into a function?
    public static int[] swap(int i, int j, int[] array) {
        int placeholder = array[i];
        array[i] = array[j];
        array[j] = placeholder;
        return array;
    }

    /*
     * public static int[] quicksort(int[] array) { int pivot = array[0]; }
     */

    /**
     * not arbitrary what data structure to use. java arrays are not that
     * powerful. dont know current length linkedlist might be better choice
     */
    public static int[] quicksortWithArrays(int[] array) {
        int pivot = array[0];

        // TODO: when instantiate array. always have to set size?
        int[] less = new int[array.length];
        int[] more = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < pivot) {
                less[less.length] = array[i];
            } else if (array[i] > pivot) {
                more[more.length] = array[i];
            } else {
                // when duplicates
            }
        }

        return null;
    }

}
