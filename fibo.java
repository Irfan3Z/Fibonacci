public class fibo {
	
	public static int of (int n) {
		
		int zero=0,one=1;
		int fn=0;
		
		if(n==0)  return zero;
		
		else if(n==1) return one;
		
			for(int i=2;i<=n;i++) {
				fn=zero+one;
				zero=one;
				one=fn;
			}
			return fn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		
		while(true) {
			System.out.println("Fibonacci.of("+ n +") == "+of(n));
			n++;
			if(of(n)>200) break;
		}
		
	}
}
