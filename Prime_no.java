package logical;

import java.util.Scanner;

public class Prime_no {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println(" Enter the no.= ");
		int num = Sc.nextInt();
		Sc.close();
		for (int i=2; i<=num/2; i++) {
			if ( num % i !=0 ) {
				System.out.println(num + " is prime no");
				break;
			}
			else
				System.out.println(num + " is not prime no");
			break;
			
		}
	}

}
