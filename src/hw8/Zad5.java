package hw8;

import java.util.Scanner;

public class Zad5 {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		System.out.println("Enter a string :");
		str = sc.nextLine();
		
		System.out.println(str + " -> " + starAdjacent(str,0));


	}
	
	static String starAdjacent(String string , int position){
		
		if(position < string.length()-1){
			if(string.charAt(position) == string.charAt(position + 1)){
				
				// tozi red stava malko dulug ama ne se setih po drug nachin kak da stane :)
				string = string.substring(0,position)+ string.charAt(position) + "*" + string.substring(position+1, string.length());
				
				position++;
				return starAdjacent(string,position);
				
			}else{
				position++;
				return starAdjacent(string,position);
			}
		}else{
			return string;
		}
	}

}
