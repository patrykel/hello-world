public class PrimeGenerator {
	public int prime(int n){
		if(n <= 0){
			return -1;
		}
		
		int result = -1;
		int counter = 0;
		
		for(int i=2;;i++){
			boolean prime = true;
					
			for(int j=2; j*j<=i; j++){
				if(i%j == 0){
					prime = false;
					break;
				}
			}
			
			if(prime){
				counter++;
			}
			if(counter == n){
				result = i;
				break;
			}
		}
		
		return result;
	}
}