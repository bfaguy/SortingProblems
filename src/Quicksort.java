
public class Quicksort {

    public static int[] quicksort(int[] array) {
        int pivotValue = array[0];

        int l = 0;
        int r = 0;

        int[] left = new int[array.length];
        int[] right = new int[array.length];

        for (int i = 1; i < array.length; i++) {
            int currValue = array[i];
            if (currValue < pivotValue) {
                left[l++] = currValue; 
            } else if (currValue > pivotValue) {
                right[r++] = currValue; 
            } else {
                // when duplicates
            }
        }
        
        left = quicksort(shrink(left));
        right = quicksort(shrink(right));

        return null;
    }

    private static int[] shrink(int[] right) {
        // TODO Auto-generated method stub
        return null;
    }

}
