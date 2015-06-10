
public class Quicksort {
    
    public static int[] quicksort(int[] array) {
        
        if( array.length <= 1) {
            return array;
        }
        
        int pivotIndex = array.length / 2;
        //System.out.println("pivotIndex: " + pivotIndex);
        int pivotValue = array[pivotIndex];
        
        int leftCount = countSmallerThanPivot(pivotValue, array);
        int[] left = new int[leftCount];
        int[] right = new int[array.length - leftCount - 1];

        int l = 0;
        int r = 0;

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
        
        left = quicksort(left);
        right = quicksort(right);
        
        System.arraycopy(left, 0, array, 0, left.length);
        array[left.length] = pivotValue;
        System.arraycopy(right, 0, array, left.length+1, right.length);

        return null;
    }

    // count the number of elements smaller than pivot
    public static int countSmallerThanPivot(int pivotValue, int[] array) {
        int count = 0;
        for (int i=0; i < array.length; i++) {
           if (array[i] < pivotValue) {
               count++;
           }
        }
        return count;
    }
}
