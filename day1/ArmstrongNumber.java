package assignment1.day1;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
	
			int num =153 , add=0, n ;
			 
			while(num>0) {
				n =num%10;
			    System.out.println(n);
				add = add +n*n*n;
				System.out.println(add);
			    num=num/10;
			    System.out.println(num);
			}
			System.out.println(add);
		}
}

	
		
		
		

