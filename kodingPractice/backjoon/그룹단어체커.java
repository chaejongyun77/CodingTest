package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count =0;
		
		
		for (int i = 0; i < n; i++) {
			boolean[] visited = new boolean[26];  //a~z알파벳 방문여부
			boolean tmp = true;
			String line = br.readLine();
			
			for (int j = 0; j < line.length(); j++) {
				int index = line.charAt(j)-'a';//아스키코드 a:96
				if(visited[index]) {
					if(line.charAt(j)!=line.charAt(j-1)) {
						tmp=false;
					}
				}else {
					visited[index]=true;
				}
				
			}
			if(tmp==true) count++;
		}
		System.out.println(count);
		
	}
}
