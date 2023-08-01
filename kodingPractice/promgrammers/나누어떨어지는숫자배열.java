package 구현;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		int[] solution = new int[] {3,2,6};
		List<Integer> answer1 = new ArrayList<>();
		int divisor =10;
		
		
		
		for (int i = 0; i < solution.length; i++) {
			if(solution[i]%divisor==0) {
				answer1.add(solution[i]);
				
			}
				
			
		}
		if(answer1.size()==0) {
			answer1.add(-1);
			
		}
		
		Collections.sort(answer1);
		
		int[] answer= new int[answer1.size()];
		for (int i = 0; i < answer1.size(); i++) {
			answer[i] = answer1.get(i);
		}
		
		
	} 
}
