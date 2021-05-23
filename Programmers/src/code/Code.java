package code;

public class Code {
	
	public static void main(String[] args) {
		//Programmers 12926 

		String s = "a B z";	//"AB", "z"
		int n = 4;			//1
		
		System.out.println(solution(s, n));
	}
	
	public static String solution(String s, int n) {
		String answer = "";
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < s.length(); i++) {
			if(arr[i] == ' ') {
				answer += " ";
			} else if(Character.isLowerCase(arr[i])) {
				if(arr[i]+n > 'z') {
					answer += (char) (arr[i] + n -26);
				} else {
					answer += (char) (arr[i] + n);
				}
			} else {
				if(arr[i] + n > 'Z') {
					answer += (char) (arr[i] + n - 26);
				} else {
					answer += (char) (arr[i] + n);
				}
			}
		}
		
		return answer;
	}

}
