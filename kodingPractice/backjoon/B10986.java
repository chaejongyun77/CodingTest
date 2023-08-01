package B10986;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine());
		int[] arr= new int[N];
		int result =0;
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		System.out.println(count);
		
	}

	

	
}

/*
 * for (int i = 0; i < arr.length; i++) {
			result = result+arr[i];
			if(result%M==0) {
				count++;
			}
			else {
				continue;
			}
			
		}
 */
