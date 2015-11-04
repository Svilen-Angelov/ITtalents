package exeptions;

import static exeptions.ExceptionGenerator.*;

import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		nullPointerException();
		indexOutOfBoundsException();
		outOfMemoryError();
		
		chainedException();
		
		finallyBlock();
		
		try {			
			ioException();
		} catch (IOException e) {
			e.printStackTrace();
			
			StackTraceElement[] elements = e.getStackTrace();
			for(int i=0; i < elements.length; ++i) {
				System.out.println(elements[i].toString());
			}
			
			String message = e.getMessage();
			System.out.println(message);
		}
		
		int[] a = null;
		
		printArrayInfo(a);
	}
	
	static void printArrayInfo(int[] arr) {
		try {
			System.out.println("Array length: " + arr.length);
			System.out.println("At index 2: " + arr[2]);
		} catch (NullPointerException e) {
			System.out.println("The array is null.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid index.");
		}
		
		
	}
}
