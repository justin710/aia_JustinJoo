package task;

public class ExMain {


public static void main(String[] args) {

Ex2 ex2 = new Ex2(); 

int[][] arr = new int[3][4];

	  

	  for (int i=0; i<arr.length; i++) {

	   for(int j=0; j<arr[i].length; j++) {

	    arr[i][j]=i+j;

	   }

	  }

	 	  

	 ex2.addOneDArr(arr, 5);

	  

	  for (int i=0; i<arr.length; i++) {

	   for (int j=0; j<arr[i].length; j++) {

	    System.out.print(arr[i][j]+" ");

	   }

	   System.out.println();

	  }




	 }






	}
