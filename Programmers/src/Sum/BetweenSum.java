package Sum;

public class BetweenSum {
	// Programmers 12912

	public static void main(String[] args) {
		int a = 3; // 3, 5
		int b = 5; // 3, 3
		System.out.println(solution(a, b));
		System.out.println(solution2(a, b));
	}

	public static long solution(int a, int b) {
		long answer = 0;
		//a, b의 순서가 상관없으므로
		if (a > b) {
			for (int i = b; i < a + 1; i++) {
				answer += i;
			}
		} else if (a < b) {
			for (int i = a; i < b + 1; i++) {
				answer += i;
			}
		} else if (a == b) {
			answer = a;
		}
		return answer;
	}
	
	public static long solution2(int a, int b) {
		long answer = 0;
		long min = Math.min(a, b);
		long max = Math.max(a, b);

		for (long i = min; i < max + 1; i++) {
			answer += i;
		}

		return answer;
	}

}
