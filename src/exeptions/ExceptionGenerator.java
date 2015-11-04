package exeptions;

import java.io.File;
import java.io.IOException;

public class ExceptionGenerator {

	private ExceptionGenerator() {
		
	}
	
	public static void nullPointerException() {
		
		Person john = new Person();
		Person johny = new Person();
		
		john.hasTheSameNameAs(johny);
	}
	
	public static void indexOutOfBoundsException() {
		int[] array = new int[2];
		
		array[2] = 3;
	}
	
	public static void outOfMemoryError() {
		int n = Integer.MAX_VALUE;
		
		int[] a = new int[n];
	}
	
	public static void arithmeticException() {
		int x = 1 / 0;
	}
	
	public static void ioException() throws IOException {
		final String filename = "?";
		File file = new File(filename);
		file.createNewFile();
	}
	
	public static void chainedException() {
		Object o = null;
		
		try {
			System.out.println(o.toString());
		} catch (NullPointerException e) {
			throw new RuntimeException("NULL POINTER", e);
		}
	}
	
	public static void multipleCatches() {
		try {
			ioException();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void finallyBlock() {
		try {
			ioException();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			System.out.println("FINALLY\n");
		}
		
	}
}
