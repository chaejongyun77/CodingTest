package B9742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N; // 찾아야하는 순서
    static int count; // 만든 문자열 순서
    static String str; // 입력받은 문자열
    static char arr[]; // 문자열의 원소 배열
    static char result[]; // 정답 배열
    static boolean visited[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		
		while((line=br.readLine())!=null){
			count=0;
			StringTokenizer st = new StringTokenizer(line);
			
			str =st.nextToken();
			N = Integer.parseInt(st.nextToken()); // static으로 선언했으면 타입 설정 안해도됨
			
			arr=str.toCharArray();// 문자열 -> 문자 단위로 쪼개서 배열에 저장
		
			visited = new boolean[arr.length];
			result = new char[arr.length];
		
			
			if(factorial(arr.length)<N) {
				System.out.println(str+" "+N+" = "+"No permutation");
			}
			else {
				recur(0);
		}
	}
	}
	private static int factorial(int n) {
		if (n==1) {
			return 1;
		}
		return factorial(n-1)*n;
	}

	private static void recur(int deapth) {
		
		if(deapth==arr.length) {	
			count++;
			if(count ==N) {		
				print();
				
			}
			return;
		}
			//처리코드(result에 숫자 누적)
		for (int i = 0; i < arr.length && count!=N; i++) { //답을 찾으면 멈춤
			if(visited[i]==false) {
				result[deapth]= arr[i];
				visited[i] =true;
				recur(deapth+1);
				visited[i] =false;					
			}	
		}	
	}
	private static void print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]);
		}
		System.out.println(str + " " + N + " = " + sb.toString());
	}

	
	
	
}

//for (int i = 0; i <N.length(); i++) {
//arr[i]=N.charAt(i);	//문자열을 배열로
//	
//} -> toCharArray : 문자열 -> 쪼개서 배열로[]
//length: []배열의 길이, length():문자열의 길이
//for(char c : result)
// sb.append(c);
// StringBuilder append는 문자열을 더하는 역할
///String str = new String();

//char c = ' ';

//str = "안녕하세요";

//c = str.charAt(0);

//문자열에서 0번째 있는 문자를 char타입으로 변