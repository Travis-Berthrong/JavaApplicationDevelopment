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
}
