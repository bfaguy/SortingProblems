
public class Quicksort {

    /*
     * public static int[] quicksort(int[] array) { int pivot = array[0]; }
     */

    /**
     * not arbitrary what data structure to use. java arrays are not that
     * powerful. dont know current length linkedlist might be better choice
     */
    public static int[] quicksortWithArrays(int[] array) {
        
        int pivotIndex = (int) Math.floor(array.length / 2);
        int pivotValue = array[pivotIndex];

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
