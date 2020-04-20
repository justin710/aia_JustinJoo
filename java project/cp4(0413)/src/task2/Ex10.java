package task2;

public class Ex10 {

	public static void main(String[] args) {

int num = 12345;
int sum = 0;

sum += (num/10000) + (num/1000%10) + (num/100%10) + (num/10%10) + (num%10);


System.out.println("sum="+sum);
	}

}
