package PaginationHelper;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class PaginationHelperTest {

    PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);
    PaginationHelper<Character> emptyList = new PaginationHelper(Arrays.asList(), 4);
    PaginationHelper<Character> arr = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e' ), 2);

    @Test
    public void shouldShowItemCount() {
        // assertEquals("expected", "actual");
        assertEquals(helper.itemCount(), 6);
        assertEquals(arr.itemCount(), 5);
    }

    @Test
    public void shouldShowPageCount() {
        // assertEquals("expected", "actual");
        assertEquals(helper.pageCount(), 2);
        assertEquals(arr.pageCount(), 3);
    }

    @Test
    public void shouldShowPageItemCount() {
        // assertEquals("expected", "actual");
        assertEquals(helper.pageItemCount(-1), -1);
        assertEquals(helper.pageItemCount(2), -1);
        assertEquals(helper.pageItemCount(1), 2);
        assertEquals(helper.pageItemCount(0),4);

        assertEquals(arr.pageItemCount(0),2);
        assertEquals(arr.pageItemCount(1),2);
        assertEquals(arr.pageItemCount(2),1);
    }

    @Test
    public void shouldShowPageIndex() {
        // assertEquals("expected", "actual");
        assertEquals(helper.pageIndex(1), 0);
        assertEquals(helper.pageIndex(7), -1);
        assertEquals(helper.pageIndex(6), 1);
        assertEquals(helper.pageIndex(2), 0);
    }

    @Test
    public void shouldShowPageIndexWithEmptyList() {
        // assertEquals("expected", "actual");
        assertEquals(emptyList.pageIndex(2), -1);
    }
}


