package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    private void permutations(String soFar, String rest, List<String> list) {
        if(rest.length() == 0)
            list.add(soFar);
        else {
            for(int i=0; i<rest.length(); i++) {
                String next = soFar + rest.charAt(i);
                String remaining = rest.substring(0, i) + rest.substring(i+1);
                permutations(next, remaining, list);
            }
        }
    }

    public List<String> listPermutations(String word) {
        List<String> list = new ArrayList<>();
        permutations("", word, list);
        return list;
    }

    private void subsets(List<String> list, String soFar, String rest) {

        if(rest.length() == 0)
            list.add(soFar);
        else {
            subsets(list, soFar + rest.charAt(0), rest.substring(1));
            subsets(list, soFar, rest.substring(1));
        }

    }

    public List<String> listSubsets(String word) {
        List<String> list = new ArrayList<>();
        subsets(list, "", word);
        return list;
    }

    //checks if key exists in a sorted array, requires a sorted array.
    public int binSearch(int arr[], int key) {
        return binSearch(arr, key, 0, arr.length);
    }


}
