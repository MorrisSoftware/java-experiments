package za.co.oldtimerza.sorts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class QuickSortTests {
    private QuickSort quickSort;

    @Before
    public void setup() {
        quickSort = new QuickSort();
    }

    @Test
    public void shouldSortIntegerArray() {
        List<Integer> sortableList = Arrays.asList(4, 3, 2, 9, 11, 12, 19, 1, 0, 45, 23, 15);

        List<Integer> sortedList = quickSort.sort(sortableList);

        List<Integer> expectedResult = Arrays.asList(0, 1, 2, 3, 4, 9, 11, 12, 15, 19, 23, 45);
        Assert.assertEquals(expectedResult, sortedList);
    }
}
