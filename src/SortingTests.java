import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.lang.reflect.Array;

import org.junit.Test;

public class SortingTests {
    // TODO: test for negative numbers

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

    /*
    @Test
    public void testQuicksort() {
        int[] array = {6,7,4,9,0};
        assertArrayEquals(SortService.quicksort(array), new int[]{-4,0,1,4,6,7,9});
    }
    */
    
    @Test
    public void testArrayLength() {
        int[] array = new int[4];
        array[0] = 2;
        assertThat(Array.getLength(array), is(1));
    }
    
    @Test
    public void testSort() {
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
