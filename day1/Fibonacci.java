package assignment1.day1;

public class Fibonacci {
public static void main(String[] args) {
	
	int num=10 , firstNum=0 , secondNum=1 , sum ;
	System.out.println(firstNum  );
	System.out.println(secondNum);
	for (int i = 0; i < num; i++) {
		sum=firstNum + secondNum;
	    firstNum = secondNum;
	    secondNum = sum;
		System.out.println(sum);
	}
}
}

