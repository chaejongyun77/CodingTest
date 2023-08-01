package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	
		
		int[][] arr= new int[n][2];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			int start= Integer.parseInt(st.nextToken());
			int end= Integer.parseInt(st.nextToken());
			arr[i][0] =start;
			arr[i][1] =end;
			}	
		Arrays.sort(arr,new Comparator<int []>() { //{1,2}와 {2,2}를 비교하므로 <int []>
												  // 익명클래스를 사용 (1번만 comporator를 오버라이드해서 사용하고 싶기때문에)
			@Override
			public int compare(int[] o1, int[] o2) {  
				if (o1[1] ==o2[1]) { //{1,2}에서 2와 {2,2}에서 2를 비교해서 같으면 즉 끝나는시간이 같으면
				return o1[0]-o2[0]; 	// 출발시간을 기준으로 정렬
				}
				return o1[1]-o2[1]; 	// 끝나는시간을 기준으로 정렬
			}		
		});
		int end = -1;
		int count= 0;
		for (int i = 0; i < arr.length; i++) {
			if(end<=arr[i][0]) { //시작시간과 끝나는 시간이 같을 수도 있으니 <=
				end=arr[i][1];
				count++;
			}
		}
		System.out.println(count);
			
		}
	}


