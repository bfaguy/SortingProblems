import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class SortingTests {
    @Test
    public void testInsertionsort_Size2() {
        int[] array = {4,1};
        assertThat(SortService.insertionSort(array), is(new int[]{1,4}));
    }

    @Test
    public void testInsertionsort_Size5() {
        int[] array = {6,7,4,9,0};
        assertThat(SortService.insertionSort(array), is(new int[]{0,4,6,7,9}));
    }

    @Test
    public void testInsertionsort_with_negative() {
        int[] array = {6,7,1,4,-1};
        assertThat(SortService.insertionSort(array), is(new int[]{-1,1,4,6,7}));
    }

    @Test
    public void testInsertionsort_with_duplicates() {
        int[] array = {6,7,7,4,-1};
        assertThat(SortService.insertionSort(array), is(new int[]{-1,4,6,7,7}));
    }
    
    // QUICKSORT /////////////////////////////////////////////////////////////////

    @Test
    public void testQuicksort() {
        int[] array = {6,7,4,9,0};
        assertArrayEquals(Quicksort.quicksort(array), new int[]{0,4,6,7,9});
    }
    
    @Test
    public void testCountSmallerThanPivot() {
        int[] array = {6,7,4,9,0};
        assertThat(Quicksort.countSmallerThanPivot(6, array), is(2));
    }
    
    // MISC /////////////////////////////////////////////////////////////////////
    @Test
    public void testSwap() {
        int[] array = {23,100}; 
        assertThat(SortService.swap(0,1,array), is(new int[]{100,23}));
    }
    
    //@Test 
    //input array is null. array length is 0
    // input of length 1
    // input of length 2
    // input of length 3
    // duplicate input
}
