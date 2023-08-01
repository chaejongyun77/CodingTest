package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class B1541 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정 
		// 뺄셈기준으로 토큰을 나눈다.
		StringTokenizer subtraction = new StringTokenizer(br.readLine(), "-");
		
		// subtraction에 토큰이 있으면 반복문 계속 실행
		while (subtraction.hasMoreTokens()) {
			// 값을 담을 temp 초기화
			int temp = 0;
 
			// 뺄셈으로 나뉜 토큰을 덧셈으로 분리한다.
			StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");
			
			// 덧셈으로 나뉜 토큰들을 모두 더한다. 
			while (addition.hasMoreTokens()) {
				temp += Integer.parseInt(addition.nextToken());
			}
			
			// 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
			// sum이 0이됨
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				// 두 번째 토큰부터는  sum에서 temp를 뺸다
				// 덧셈으로 나눠진 토큰들을 모두 더해서 뺀다.
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
 
}