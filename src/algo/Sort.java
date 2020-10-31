package algo;

public class Sort {
	
	int arr[];
	
	public Sort(int arr[]) {
		this.arr = arr;
	}
	
	public void setArray(int arr[]) {
		this.arr = arr;
	}
	
	public int[] getArray() {
		return arr;
	}
	
	public int[] insertionSort() {
		
		for(int i=1; i<arr.length; i++) {
			
			int key = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			
			arr[++j] = key;
			
		}
		
		return arr;
	}
	
	public int[] selectionSort() {
		
// * Selection sort algorithm.
// * It searches for the smalllest value in each iteration and pushes that value in the proper ( starting from 0, in asc. ) index.
// * Explanation : Suppose we have a list of numbers which we have to sort, say list1, how do we sort ? take another empty list, say list2,
//   now, pick the smallest number in the first list and put in the second list ( and delete it from the first list of course )
//   and repeat this operation for all the numbers, this is the essence of selection sort.
// * This implementation is inplace i.e. it doesn't uses another list for sorting but concept is still thesame.
// * Big O is O(n^2)
		
		int minIndex;
		
		for(int i=0; i<arr.length-1; i++) {
			
			minIndex = i;
			
			for(int j=i+1; j<arr.length; j++)
				if(arr[minIndex] > arr[j])
					minIndex = j;
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minindex] = temp;
		}
			    
	}

}
