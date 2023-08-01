package bFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1325 {
	static boolean visited[]; //방문배열
	static ArrayList<Integer>[] A;
	static int count;
	static int n,m;
	static int max=-1;

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer (br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		A = new ArrayList[n+1];
		int[] arr = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			A[i]= new ArrayList<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			st =new StringTokenizer (br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			A[b].add(a);
			
		}
	
		for (int i = 1; i <n+1 ; i++) {
			visited = new boolean[n+1];
			count=0;
			bfs(i);	
			arr[i]= count;
			max = Math.max(count,max);
			
		}
		
			
		for (int i = 1; i < n+1; i++) {
			if(arr[i]==max) {
				sb.append(i).append(" ");
			}	
		}
		System.out.println(sb);
		
	}
	private static void bfs(int start) {
	
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		visited[start] = true;
		
			while(!q.isEmpty()) {
				int next = q.poll();
				for (int i : A[next]) {
					if(!visited[i]) {
						visited[i]=true;	
						q.add(i);			
						count++;
				}	
				}
			}
	}
}


