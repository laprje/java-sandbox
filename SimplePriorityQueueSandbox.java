package cs2420sandbox;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

import assign03.PriorityQueue;

/**
 * This class is a simple priority queue.
 *
 * @author Lansing Jenkins and Jack Koster
 * @version January 30, 2022
 */

public class SimplePriorityQueueSandbox<Type> implements PriorityQueue<Type>{

    @SuppressWarnings("unchecked")
	Type[] arr = (Type[]) new Object[32];
    Comparator<? super Type> comparator = null;

    public SimplePriorityQueueSandbox(){

    }

    public SimplePriorityQueueSandbox(Comparator<? super Type> cmp) {
    	this.comparator = cmp;
    }

    /**
     * Retrieves, but does not remove, the maximum element in this priority
     * queue.
     *
     * @return the maximum element
     * @throws NoSuchElementException if the priority queue is empty
     */
    public Type findMax() throws NoSuchElementException {
    	//TODO finish method
        return null;
    }

    /**
     * Retrieves and removes the maximum element in this priority queue.
     *
     * @return the maximum element
     * @throws NoSuchElementException if the priority queue is empty
     */
    public Type deleteMax() throws NoSuchElementException {
    	//TODO finish method
        return null;
    }

    /**
     * Inserts the specified element into this priority queue.
     *
     * @param item - the element to insert
     */
    public void insert(Type item) {
    	if(this.BinarySearch((Type) item) > 0) {
    		//TODO finish writing insert method based on binary search
    	} else {
    		//TODO
    	}
    }

    /**
     * Indicates whether this priority queue contains the specified element.
     *
     * @param item - the element to be checked for containment in this priority queue
     */
    public boolean contains(Object item) {
    	//TODO finish method
        return false;
    }

    /**
     * @return the number of elements in this priority queue
     */
    public int size() {
    	//TODO finish method
        return 0;
    }

    /**
     * @return true if this priority queue contains no elements, false otherwise
     */
    public boolean isEmpty() {
    	//TODO finish method
        return false;
    }

    /**
     * Removes all of the elements from this priority queue. The queue will be
     * empty when this call returns.
     */
    public void clear() {
    	//TODO finish method
    }

    /**
     * Inserts the specified elements into this priority queue.
     *
     * @param coll - the collection of elements to insert
     */
	public void insertAll(Collection coll) {
		//TODO finish method
	}
	


	private int BinarySearch(Type item) {
		int low = 0;
		int high = this.arr.length - 1;
		int mid = 0;
		//loop over array indexes
		while(low<= high) {
			if(this.comparator != null) {
				//comparator constructor called
				mid = (low+high) >>> 1;
				if(this.comparator.compare(arr[mid], item) < 0) {
					//desired value is greater than middle element
					low = mid + 1;
				} else if(this.comparator.compare(arr[mid], item) > 0) {
					//desired value is less than middle element
					high = mid -1;
				} else {
					//desired value is exactly the middle element
					return mid;
				}
			} else {
				//no comparator available; base constructor called
				mid = (low+high) >>> 1;
				@SuppressWarnings("unchecked")
				Comparable<Type> value = (Comparable<Type>) arr[mid];
				if(value.compareTo(item) < 0) {
					//desired value is greater than the middle element
					low = mid + 1;
				} else if(value.compareTo(item) > 0){
					//desired value is less than the middle element
					high = mid - 1;
				} else {
					//desired value is exactly the middle element
					return mid;
				}
			}
		}
		//Returns the middle index which is the index at which we should insert the new item.
		//Returns negative so we can differentiate between a found index and the index at which a new item will be placed.
		return -mid;
	}
}