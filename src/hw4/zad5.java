package hw4;

import java.util.Scanner;

public class zad5 {
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		double[] array = new double[10];
		
		for(int i = 0; i < array.length; i++){
			
			array[i] = i*3;
			System.out.print(array[i] + " ");
		}
		
	}
}
