package bFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2606 { 
	static int n;
	static int m;
	static int count;
	static boolean visited[];
	static ArrayList<Integer>[] A;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		A = new ArrayList[n+1];
		
		visited = new boolean[n+1];
		for (int i = 1; i <=n; i++) {
			A[i] = new ArrayList<Integer>();	
		}
		
		StringTokenizer st ;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			A[a].add(b);
			A[b].add(a); //연결만 되어있으면 바이러스에 걸리니간 양 인덱스값에추가 해 줘야됨
			
		}
		int result= dfs(1);
		System.out.println(result);
		
		
	}
	private static int dfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(start);
		visited[start] =true;
			
			while(!q.isEmpty()) {
				
				int next= q.poll();
				for (int i : A[next]) {
					if(visited[i] ==false) {
						visited[i]=true;
						q.add(i);
						count++;
					}			
				}
		
			}
		return count;	
	}
}
