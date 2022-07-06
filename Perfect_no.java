package logical;

import java.util.Scanner;

public class Perfect_no {

	public static void main(String[] args) {
		int Number;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();
		
		PerfectNumber (Number);
		sc.close();
	}

	public static void PerfectNumber (int Number) {
		int i, Sum = 0;
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format(" is a Perfect Number", Number);
		}
		else {
			System.out.format(" is NOT a Perfect Number", Number);
			
		}
	}

}
