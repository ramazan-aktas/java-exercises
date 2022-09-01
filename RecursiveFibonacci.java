public class RecursiveFibonacci {
	public static int nthFibNumber(int n)  {
		return n == 0 ? 0 : 
			n == 1 ? 1 :
				nthFibNumber(n - 1) + nthFibNumber(n - 2);

	}
	public static void main(String[] args) {
    		nthFibNumber(0); // Returns 0
		nthFibNumber(10); // Returns 55
	}

}
