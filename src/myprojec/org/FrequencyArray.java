package myprojec.org;
import java.util.Scanner;

public class FrequencyArray{
	static int [] MakeFreqArray(int ar[]) {
	int freq [] = new int [100005];
	for(int i =0;i<ar.length;i++) {
		freq[ar[i]]++;
	}
	return freq;
	}
	
	public static void main(String []args) {
System.out.println("enter the size of the array");
Scanner sc = new Scanner(System.in);
int n =sc.nextInt();
System.out.println("enter the numbers");
int arr [] =new int [n];
for(int i=0;i<n;i++) {
	arr[i] =sc.nextInt();
}
for(int x:arr) {
	System.out.print(x+" ");
}
int freq []= MakeFreqArray(arr);
System.out.println("enter number of queries");
int q = sc.nextInt();
System.out.println("enter the query");
while(q>0) {
	int a =sc.nextInt();
	if(freq[a]>0) {
		System.out.println("present");
	}else {
		System.out.println("not present");
	}
	q--;
}
	}
}