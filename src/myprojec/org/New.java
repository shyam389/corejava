package myprojec.org;

public class New {
	static void print(int ar[]) {
		for(int x:ar) {
			System.out.println(x);
		}
	}
	static void swap(int ar[],int i,int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	static void reverse(int ar[],int i,int j) {
		while(i<j) {
			swap(ar,i,j);
			i++;
			j--;
		}
	}
	static void rotate(int ar[],int k) {
		int n = ar.length;
		k = k%n;
		reverse(ar,n-k,n-1);
		reverse(ar,0,n-k-1);
		reverse(ar,0,n-1);
	}
public static void main(String []args) {
	int ar [] = {1,2,3,4,5,6,7};
	rotate(ar,6);
	print(ar);
}
}
