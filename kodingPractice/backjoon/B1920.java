package 분할정복알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920 {
	static int n;
	static int[] arr1;
	static int[] arr2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		arr1 = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			
			arr1[i]=Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int m =Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr1);
		arr2 = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			
			arr2[i]=Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < m; i++) {
			search(arr2[i]);	
		}
	}
	
	private static void search(int target) {
		int pl =0;
		int pr =arr1.length-1;
		boolean find =false;
		
		while(pl<=pr) {
			int pc = (pl+pr)/2;
			
			
			if(arr1[pc]>target) {
				pr = pc-1;
			}
			else if(arr1[pc]<target) {
				pl = pc+1;
				
			}
			else {
				find =true;
				break;
			}	
		}
		
		if(find) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}

}
