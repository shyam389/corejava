package myprojec.org;

public class Inplace {
	static void print(int ar[]) {
		for(int x:ar) {
			System.out.println(x);
		}
	}
	static void swap(int ar[],int i,int j) {
		int temp =0;
		temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
	}
	static int [] rotate(int ar[],int k) {
		int n = ar.length;
		k = k%n;
		int i = n-k,j= n-1;
		while(i<j) {
			swap(ar,i,j);
			i++;
			j--;
		}
		i = 0;j =n-k-1;
		while(i<j) {
			swap(ar,i,j);
			i++;
			j--;
		}
		i =0;j =n-1;
		while(i<j) {
			swap(ar,i,j);
			i++;
			j--;
		}
		return ar;
	}

	
 public static void main(String []args) {
	 int ar []= {23,43,55};
	 ar = rotate(ar,1);
	 print(ar);
 }
}
