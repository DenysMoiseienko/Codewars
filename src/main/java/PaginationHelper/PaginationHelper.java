package PaginationHelper;

import java.util.List;

public class PaginationHelper<I> {

    List<I> collection;
    int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return this.collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        double result = (double) itemCount() / this.itemsPerPage;
        return (int) Math.ceil(result);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= pageCount()){
            return -1;
        }else if (pageIndex == pageCount() - 1){
            return itemCount() - (pageIndex * this.itemsPerPage);
        }
        return this.itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex > itemCount()){
            return -1;
        }
        if (collection.isEmpty()){
            return -1;
        }
        double result = (double) itemIndex / this.itemsPerPage;
        return (int) Math.floor(result);
    }
}
