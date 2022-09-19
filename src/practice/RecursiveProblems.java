package practice;

import java.util.Arrays;
import java.util.Collections;

public class RecursiveProblems {

    public double pow(int number, int pow) {

        if(pow == 0)
            return 1;

        return number * pow(number, pow - 1);

    }

    public double fastPow(int n, int pow) {

        if(pow == 0)
            return 1;
        else {
            double half = fastPow(n, pow/2);
            if(pow%2 == 0)
                return half * half;
            else
                return n * half * half;

        }

    }

    public int summation(int start, int end) {
        if(start == end)
            return start;
        return end + summation(start, end - 1);
    }

    public boolean isPalindrome(String str) {
        if(str.length() <= 1)
            return true;
        return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length() - 1));
    }

    private int binSearch(int arr[], int key, int low, int high) {
        if(low >= high)
            return -1;
        int mid = (low + high)/2;
        if(arr[mid] == key)
            return mid;
        else if(arr[mid] > key)
            return binSearch(arr, key, 0, mid - 1);
        else
            return binSearch(arr, key, mid + 1, high);
    }

    
    public int combination(int n, int r) {
        if(r == 0 || r == n)
            return 1;
        return combination(n - 1, r) + combination(n - 1, r - 1);
    }

    //checks if key exists in a sorted array, requires a sorted array.
    public int binSearch(int arr[], int key) {
        return binSearch(arr, key, 0, arr.length);
    }


}
