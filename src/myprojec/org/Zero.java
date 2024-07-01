package myprojec.org;

public class Zero {
static void sorting(int ar[]) {
	int n = ar.length;
	int zeroes = 0;
	for(int i =0;i<n;i++) {
		if(ar[i] == 0) {
			zeroes++;
		}
	}
	for(int i  =0;i<n;i++) {
		if(i<zeroes) {
			ar[i] =0;
		}else {
			ar[i] =1;
		}
	}
	
}
static void print(int ar[]) {
	for(int x:ar) {
		System.out.print(x+" ");
	}
}
	public static void main(String []args) {
		int ar [] = {0,0,1,1,1,0,1,0};
		System.out.println("after sorting");
		sorting(ar);
		print(ar);
	}
}
