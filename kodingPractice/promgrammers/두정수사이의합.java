package 구현;

import java.util.*;
import java.io.*;
class Solution {
    public long solution(int a, int b) {
        
        int[] arr = new int[Math.abs(a-b)+1];
        int  c =Math.abs(a-b);
        if(a<b) {
		long result= 0;
			for( int i =0; i<c+1; i++) {
			arr[i]=a; 
			result = result+arr[i];
			a++;
		
		}
		return result;
		}
        else {
		long result=0;
			for(int i=0; i<c+1;i++) {
				arr[i]=a;
				result = result+arr[i];
				a--;
				
			}
			return result;
		}
    }
}