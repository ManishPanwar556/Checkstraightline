package Competitiveprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Segmentedseive {
	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int t=scn.nextInt();
	while(t--!=0) {
		int n=scn.nextInt();
		int m=scn.nextInt();
		ArrayList<Integer>prime=seive();
		int arr[]=new int[m-n+1];
		for(int x:prime) {
			if(x*x>m) {
				break;
			}
			int start=(n/x)*x;
			if(x>n&&x<=m) {
				start=2*x;
			}
			if(start<n) {
				start=start+x;
			}
			
			for(int j=start;j<=m;j+=x) {
				arr[j-n]=1;
			}
		}
		for(int i=n;i<=m;i++) {
			if(i==1) {
				continue;
			}
			if(arr[i-n]==0) {
				System.out.println(i);
			}
		}
	}
	}

	private static ArrayList<Integer> seive() {
		int max=100001;
		ArrayList<Integer>al=new ArrayList<>();
		int arr[]=new int[max];
		for(int i=2;i*i<max;i++) {
			if(arr[i]==0) {
			for(int j=i*i;j<max;j+=i) {
			arr[j]=1;	
			}
			}
		}
		for(int i=2;i<max;i++) {
			if(arr[i]==0) {
				al.add(i);
			}
		}
		return al;
		
	}
}