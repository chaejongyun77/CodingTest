package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class B9663 {
 
	public static int[] arr;
	public static int N;
	public static int count = 0;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
 
		nQueen(0);
		System.out.println(count);
 
	}
 
	public static void nQueen(int depth) {
		
		if (depth == N) {
			count++;
			return;
		}
 
		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			
			if (Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
		
		// arr[]={0,3,1,2}이면 // 값은 열을 뜻하고 인덱스는 행을 뜻함.
		// 0 1 2 3 
	   //0 *
	   //1       *
	   //2   *
	   //3     *
	}
 
	public static boolean Possibility(int col) {
 
		for (int i = 0; i < col; i++) {
			// 같은 행에 존재할 경우
			if (arr[col] == arr[i]) {
				return false;
			} 
			
			/*
			 * 대각선상에 놓여있는 경우
			 * 열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다
			 */
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		
		return true;
	}
}