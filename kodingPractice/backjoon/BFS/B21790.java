package bFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B21790 {
	static int n;
	static int m;
	static boolean[][] visited;
	static int[][] arr;
	static int[] dx= {-1,1,0,0}; //상하좌우
	static int[] dy= {0,0,-1,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =new StringTokenizer (br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr= new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		String line;
		for (int i = 1; i <n+1 ; i++) {
			line = br.readLine();
			for (int j = 1; j < m+1; j++) {
				
				arr[i][j]=line.charAt(j-1)-'0';
			}
			
		}
		bfs(1,1);
		System.out.println(arr[n][m]);
	}

	private static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>(); // queue에 (1,1)쌍을 넣어줘야하니 <Integer>말고 int[]로 
		q.add(new int[] {x,y}); // q.add(1,1)이 아니라 q.add(new 타입 값)
		visited[x][y] = true;
		while(!q.isEmpty()) {
			int now[] = q.poll();
			for (int k = 0; k < 4; k++) {
				int nx = now[0]+dx[k];
				int ny = now[1]+dy[k];
				if(x>=1 && y>=1 && range(nx,ny)) {
					
						visited[nx][ny]=true;
						arr[nx][ny] = arr[now[0]][now[1]]+1;
						q.add(new int[] {nx,ny});
					}
				
			}	
		}
	
	}

	private static boolean range(int nx, int ny) {
		if(nx<n+1 && ny<m+1 && arr[nx][ny]!=0 && !visited[nx][ny]) {
			return true;}
		
		return false;
}
	
}
	

