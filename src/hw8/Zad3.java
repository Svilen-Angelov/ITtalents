package hw8;

import java.util.Scanner;

public class Zad3 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length :");
		int n = sc.nextInt();
		
		double[] array = new double[n];
		
		for(int i = 0; i < array.length; i++){
			System.out.println("Enter array[" + i + "] :");
			array[i] = sc.nextDouble();
		}
		
		System.out.println("The sum of the elements of the array is : " + recursiveSum(array ,0,0));

	}
	
	static double recursiveSum(double[] array,int index, double sum){
		
		if(index == array.length){
			
			return sum;
			
		}else{

			sum += array[index];
			index++;
			return recursiveSum(array,index,sum);
		}
	}

}
