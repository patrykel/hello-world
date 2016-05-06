public class FibonGenerator{
	public int number(int n){
		if(n == 1)
			return 1;
		if(n == 0)
			return 0;
		
		int f, fPrev;
		f = 1;
		fPrev = 0;

		for(int i=2; i<=n; i++){
			int sum = f + fPrev;
			fPrev = f;
			f = sum;
		}

		return f;
	}
}