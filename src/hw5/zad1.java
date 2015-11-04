package hw5;
import java.util.Scanner;

public class zad1 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter a number :");
			array[i] = sc.nextInt();
		}
		
		for(int i=0; i<array.length; i++){
			if(array[i] >= 0){
				System.out.printf("%d ",array[i]);
			}
		}
		
	}

}
