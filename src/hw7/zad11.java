package hw7;

import java.util.Scanner;

public class zad11 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int m = 0;
		do{
			System.out.println("Enter a positive number N:");
			n = sc.nextInt();
			
			System.out.println("Enter a positive number M:");
			m = sc.nextInt();
		}while(n <= 0 || m <= 0 || m > n);
		
		String numbers = "";
		String mStr = "" + m;

		for(int i = 0; i <= n; i++){
			
			numbers += i;
		}
		
		int position = 0;
		
		for(int i = 0; i < numbers.length(); i++){
			
			if (numbers.charAt(i) == mStr.charAt(0)){
				
				int temp = 1; // vurvi po stringa na chisloto M
				int temp2 = i+1; // vurvi po golemiq string N
				boolean match = true;
				
				while(temp < mStr.length() && temp2 < numbers.length()){
					
					if(numbers.charAt(temp2) != mStr.charAt(temp)){
						match = false;
						break;
					}
					temp++;
					temp2++;
				}
				
				if(match == true){
					position = i;
					break;
				}
			}
		}
		System.out.printf("On position %d starts the number %s",position , mStr);

	}
}
