package hw2;

import java.util.Scanner;

public class zad9 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int a,b;
		int sum = 0;
		
		do{
			System.out.println("Enter A:");
			a = sc.nextInt();
			System.out.println("Enter B:");
			b = sc.nextInt();
		}while (a >= b || a<0 || b<0);
		
		for(int i = a; i <= b; i++){
			
			if(i % 3 == 0){
				System.out.print("skip " + i+ ",");
			}else{
				System.out.print(i*i);
				sum += i*i;
				if (sum > 200){
					break;
				}
				System.out.print(","); // taka sled 100 ne otpechatva zapetaq
			}
		}
			
		}
		
		
	

}
