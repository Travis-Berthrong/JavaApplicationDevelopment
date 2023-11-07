package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Question – 1
Write a program to fetch the even numbers and odd numbers from an array and store the set
of numbers in another array as odd = {} and even={} display them. And use both array and find
the number that is divisible by 3 or 5 and display them. The order of displaying result must be
followed by using the sub-array(even, odd).
 */
public class QuestionOne {

    /*
     * Name: sort_array
     * Param: int[] array
     * Return: void
     * Description: Sorts the given int array in ascending order
     */
    public static void sort_array(int[] array) {
		for(int i=0; i< array.length; i++) {
			   for(int j=i+1; j<array.length; j++) {
			      if(array[i]>=array[j]) {
			         int temp = array[j];
			         array[j]=array[i];
			         array[i]=temp;
			      }
			   }
		}
	}
    public static void main(String[] args) {
        int[] arr;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // get the size of the array and populate it
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // sort the given arr
        sort_array(arr);

        // populate the even and odd lists
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd.add(arr[i]);
            } else {
                even.add(arr[i]);
            }
        }
        System.out.println("Odd numbers: " + odd);
        System.out.println("Even numbers: " + even);

        // populate the divisible list, first from the even list, then from the odd list
        List<Integer> divisible = new ArrayList<>();
        for (int i = 0; i < even.size(); i++) {
            if (even.get(i) % 3 == 0 || even.get(i) % 5 == 0) {
                divisible.add(even.get(i));
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            if (odd.get(i) % 3 == 0 || odd.get(i) % 5 == 0) {
                divisible.add(odd.get(i));
            }
        }
        System.out.println("Divisible by 3 or 5: " + divisible);
    }
    
}
