package B15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr;
	static int[] result;
	static int N,level;
	static boolean visited[]; //전역변수로 설정
	
 	public static void main(String[] args) throws IOException {
		
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // static으로 선언했으면 타입 설정 안해도됨
		level = Integer.parseInt(st.nextToken()); //
		arr = new int[N]; 	
		result = new int[level]; //결과 배열 						
		visited = new boolean[arr.length];
		
		for (int i = 0; i <arr.length; i++) {
			arr[i]=i+1;	
		}
		recur(0);	
	}

	private static void recur(int deapth) {
		if(deapth==level) {
			for (int i :result) {
				System.out.print(i+" ");		
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if(visited[i]==false) {
				result[deapth]= arr[i];
				visited[i] =true;
				recur(deapth+1);
				visited[i] =false;					
			}
			
		}
		
	}
}
