package B11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[N];
		int result=0;
		int result2=0;
		
		
		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
			
		}
		Collections.sort(arr);
		for (int i = 0; i < N; i++) {
			
		}
		
		for (int i = 0; i < N; i++) {
			
			result = result + arr.get(i);
			arr2[i]=result;
			
		}
		for (int i = 0; i < N; i++) {
			result2 = result2+arr2[i];
			
			
		}
		System.out.println(result2);
	}
}
