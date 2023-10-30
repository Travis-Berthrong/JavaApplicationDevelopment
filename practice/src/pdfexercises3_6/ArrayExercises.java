package pdfexercises3_6;

public class ArrayExercises {
	
	public void printAscending(int[] array) {
		for(int i=0; i< array.length; i++) {
			   for(int j=i+1; j<array.length; j++) {
			      if(array[i]>=array[j]) {
			         int temp = array[j];
			         array[j]=array[i];
			         array[i]=temp;
			      }
			   }
			   System.out.printf("%d*", array[i]);
		}
		System.out.println();
	}

	public void sort_array(int[] array) {
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

// Write a program to add the element of Array List as arguments of main
// method(Run time) and rearrange them and print them in a new line in ascending order

	public static void main(String[] args) {
		ArrayExercises arrayExercises = new ArrayExercises();
		int[] array = new int[args.length];
		for(int i=0; i<args.length; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		arrayExercises.sort_array(array);
		for (int i=0; i<array.length; i++) {
			System.out.printf("%d", array[i]);
			System.out.println();
		}
	}
}

