package logical;

import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter The No.= ");
		int num = sc.nextInt();
		int k = 0;
		while (num != 0) {
			int reminder = num%10;
			k = k*10+reminder;
			num = num/10;
		}
		sc.close();
		System.out.println("The reverse no. of given no. is "+ k);

	}

}
