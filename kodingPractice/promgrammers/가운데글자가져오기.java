package 프로그래머스;



public class 가운데글자가져오기 {
	public static void main(String[] args) {
		String s = "abcde";
		int a = s.length()/2;
		if((s.length()%2)==0) {
			String answer = s.substring(s.length()/2-1,s.length()/2+1);
			
		}
		else {
			String answer = s.substring(s.length()/2,a+1);
			System.out.println(answer);
		}
		
	
	}
}
