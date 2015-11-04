package hw5;

public class zad4 {
	
	public static void main(String[] args){
		
		int[] array = { 1, 0, 15, -1, 0, 0, 8, 7, 4, 0, 0, -12};
		
		int zeroesCount = 0;
		
		for(int i =0; i < array.length; i++){
			
			if(array[i] == 0){
				
				zeroesCount++;
			}
		}
		
		for(int i = 0; i< array.length; i++){
			
			if (array[i] == 0){
	// kudeto nameri 0-la mesti osanalite elementi ot masiva s 1 nazad.	
				int tempI = i;
				
				for (int tempJ = tempI+1; tempJ < array.length; tempJ++){
    // ako imashe poveche ot 1 nula podred ne raboteshe i zatova dobavih tova while.  
					while(array[tempJ] == 0 && tempJ < array.length-1){
						tempJ++;
						}

					array[tempI] = array[tempJ];
					tempI++;
				}
			}
		}
		
		for(int i = array.length - 1; i > array.length - zeroesCount - 1; i--){
			array[i] = 0;  // kolkoto 0 ima zapulva poslednite elementi s tolkova 0li.
		}
				
		for(int i = 0; i< array.length; i++){
			System.out.printf("%d ",array[i]);
		}
	}
}
