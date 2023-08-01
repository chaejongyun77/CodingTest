package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2667 {
	
	static int n;
	static int [][] arr;
	static boolean[][] visited;
	static int dirx[] = {-1,1,0,0};
	static int diry[] = {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		arr = new int[n][n];
		visited= new boolean[n][n];
		int home =0; // 단지 개수 
		List<Integer> countHome = new ArrayList <>(); 
		
		String line;
		for (int i = 0; i < n; i++) {
			line = br.readLine();
			for (int j = 0; j <n ; j++) {
				arr[i][j]= line.charAt(j)-'0';	
		}
			//home
	}	
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(!visited[i][j] && arr[i][j]==1) {
					int result = bfs(i,j); // 집 수 가져오기
					home++; // bfs가 성공할 때 마다 단지 수 +1증가
					countHome.add(result); 
				}
			}
		}
		Collections.sort(countHome); // 정렬
		
		System.out.println(home);
		for (int i : countHome) {
			System.out.println(i);
			
		}
}
	private static int bfs(int i, int j) {
		int count =1;
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {i,j});
		visited[i][j]=true;
		while(!q.isEmpty()) {
			int[] now = q.poll();
			for (int k = 0; k < 4; k++) {
				int dx = now[0]+dirx[k];
				int dy = now[1]+diry[k];
				if(dx>=0 && dy>=0 && dx<n && dy<n && !visited[dx][dy] && arr[dx][dy]==1) {
					q.add(new int[] {dx,dy});
					visited[dx][dy]=true;
					count++;		
					}
				}
			}
		return count;
		
		}
	}

