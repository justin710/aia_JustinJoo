package task;

public class Exexex {


int[][] arr2=new int[2][2];



arr2[0][0]=sc.nextInt();

arr2[0][1]=sc.nextInt();

arr2[1][0]=sc.nextInt();

arr2[1][1]=sc.nextInt();



addOneDArr(arr2, 3);



// 동작 확인출력

for(int i=0; i<2; i++) {

 for(int j=0; j<2; j++) {

  System.out.println(arr2[i][j]);
 
 }

}