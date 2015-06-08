public class SortService {

    public static int[] insertionSort(int[] array) {
        for (int target = 1; target < array.length; target++) {
            // find the right place for ith element
            int target_value = array[target];

            // the 0ths item to the (i-1)th items are already sorted
            for (int i = 0; i < target; i++) {
                if (target_value < array[i]) {

                    // move everything down
                    System.arraycopy(array, i, array, i+1, target-i);
                    
                    // insert target value where ith element was
                    array[i] = target_value;

                    // break out of for loop
                    break;
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

}

