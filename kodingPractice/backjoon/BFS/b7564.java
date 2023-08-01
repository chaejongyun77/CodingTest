package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b7564 {
	static int[] dirx = {-1,-2,-2,-1,1,2,2,1};
	static int[] diry = {-2,-1,1,2,2,1,-1,-2};
	static int[] start;
	static int[] end;
	static int[][] count;
	static int[][] arr;
	static boolean[][] visited;
	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < t; i++) {
			start = new int[2];
			end =  new int[2];
			
			n = Integer.parseInt(br.readLine());
			
			count = new int[n][n];
			arr =new int[n][n];
			visited = new boolean[n][n];
			
			st = new StringTokenizer(br.readLine());
				for (int j = 0; j < start.length; j++) {
					start[j]= Integer.parseInt(st.nextToken());
				}
			st = new StringTokenizer(br.readLine());
				for (int k = 0; k < end.length; k++) {
					end[k] = Integer.parseInt(st.nextToken());
				}
			
			
			int result = bfs();
			System.out.println(result);
		}
		
}

	private static int bfs() {
		
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {start[0],start[1]});
		visited[start[0]][start[1]]=true;
		
		while(!q.isEmpty()) {
			int now[] = q.poll();
//			if(now[0]==end[0] && now[1]==end[1]) { //뺀 값이 도착지점과 같으면
//				int result = count[now[0]][now[1]]; // 도착지점의 count값 출력
//				return result;
//			}
			for (int i = 0; i < 8; i++) {
				int dx = now[0]+dirx[i]; //나이트 8방향으로 이동
				int dy=  now[1] +diry[i];// 
				
				if(dx>=0 && dy>=0 && dx <n && dy<n &&  !visited[dx][dy] ) { //범위안에 속하면
					count[dx][dy] = count[now[0]][now[1]]+1; 
					visited[dx][dy]=true;
					q.add(new int[] {dx,dy});
					
					if(dx ==end[0]&& dy==end[1]) {
						int result = count[dx][dy];
						return result;
					}
					

				}		
			}
		}	
		return count[start[0]][start[1]]; // 시작과 도착이 같으면
	}
}
