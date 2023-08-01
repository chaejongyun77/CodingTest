package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11047 {
	public static void main(String[] args) throws IOException {
			
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k =Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		int count=0;
		
		for (int i = 0; i < n; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for (int i =n-1; i >=0; i--) {
			if(arr[i]<=k) {
				count =count+(k/arr[i]);
				k=k%arr[i];
			}
		}
		
		System.out.println(count);
		
	}
}
