package recursion;

public class TaylorSeries {
	static int p=1,f=1;
	public static void main(String args[]) {
		System.out.println(e(2,3));
	}
	static int e(int x,int n) {
		if(n==0) {
			return 1;
		}
		int r;
		r = e(x,n-1);
		p=p*x;
		f=f*n;
		System.out.println("p,f : "+p+" "+f);
		return r+p/f;
	}
}
