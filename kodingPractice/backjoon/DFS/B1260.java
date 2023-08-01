package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260 {
	static boolean[] visited; // 방문배열
	static int[][] arr; 	  // 인접행렬
	static int node,line,start; 	//노드,간선수,시작점
	
	static Queue<Integer> q = new LinkedList<>(); // DFS를 수행하기 위한 큐
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());
		
		arr = new int[node+1][node+1]; // 정점이 1부터 시작하니 +1을 해줌
		visited = new boolean[node+1];
		 
		for (int i = 0; i < line; i++) {       //입력받고 인접행렬에 추가
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] =1; // 인접행렬에 1을 추가해주는 작업
		}
		dfs(start);
		visited = new boolean[node+1]; //방문배열 초기화
		System.out.println();
		bfs(start);		
		}
	
	private static void bfs(int i) {
		
		q.add(i);            //큐에 시작노드 추가
		visited[i] =true; 	 //시작노드 방문처리
		System.out.print(i+" ");	// 시작노드 출력
		
		while(!q.isEmpty()) {		//q가 빌때까지
			int n = q.poll();	//q 삭제
			
			
			for (int j = 1; j <= node; j++) { //깊이만큼
				if(arr[n][j]==1 && !visited[j]) { 	// n과 근접한 노드 모드 찾아서 
					q.add(j);     					// add
					System.out.print(j+" "); 		// 출력
					visited[j]=true;				// 방문처리
			}	
		}
	}
	}
	
	private static void dfs(int i) {
		visited[i]= true;
		System.out.print(i+" ");
		
		for (int j = 1; j <= node; j++) { // 깊이만큼 반복
			if(arr[i][j]==1 && !visited[j]) //인접행렬이 1이고 방문을 안했으면
				dfs(j);	
		}		
}	
	}


