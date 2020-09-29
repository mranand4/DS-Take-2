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

}
