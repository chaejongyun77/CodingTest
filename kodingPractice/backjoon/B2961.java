package 부분집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class B2961 {
	static int[] arr ; //원소
    static boolean[] visited;//사용여부
    static int N ; //답의 길이
    static int[] result; //답저장배열
    
    static int[] sArray;
    static int[] bArray;
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		visited = new boolean[N];
		arr = new int[N+1];
		result = new int[N];
		
		bit();
		
		sArray= new int[N];
		bArray = new int[N];
		
		for (int i = 1; i < N+1; i++) {
			st =new StringTokenizer(br.readLine());
			int S=Integer.parseInt(st.nextToken());
			int B =Integer.parseInt(st.nextToken());
				
			for (int j = i; j < N+1; j++) {
				sArray[j]=S;
				bArray[j]=B;	
			}
		}
		Arrays.sort(result);
		System.out.println(result[0]);
		
	}

	private static void min() {
		for (int i = 0; i < N; i++) {
			
			
		}
		
	}

	private static void bit() {
		for (int i = 0; i < 1 << N; i++) { 
            for (int j = 0; j < N; j++) { 
                if ((i & 1 << j) != 0) 
                	if(j!=0) {
                		result[j]=sArray[j]-bArray[j]
                	}
                	//System.out.print(arr[j] + " ");			
        
                            
            }
            System.out.println();
        }
		
	}
	
	

}
