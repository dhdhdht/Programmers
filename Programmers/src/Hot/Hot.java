package Hot;

import java.util.PriorityQueue;

public class Hot {
	
	public static void main(String[] args) {
		//Programmers 42626
		
		int[] scoville = {1, 2, 3, 9, 10, 12};
		//int[] scoville = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int K = 7;
		System.out.println(solution(scoville, K));
	}
	
	public static int solution(int[] scoville, int K) {
		
		//우선순위 큐(숫자가 낮은수부터) 정의
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//int배열을 큐에 넣어준다
		for(int i = 0; i < scoville.length; i++) {
			pq.add(scoville[i]);
			System.out.println("pq : " + pq);
		}
		
		int answer = 0;
		//모든 음식이 스코빌지수 K보다 커야하므로 K보다 작을때까지 반복
		while(pq.peek() < K) {
			if (pq.size() == 1) {
                return -1;
		}
			
			int first = pq.poll(); //가장 맵지 않은 음식
			//System.out.println("minpq : " + pq);
            int second = pq.poll(); //두번째로 맵지 않은 음식
            //System.out.println("minpq2 : " + pq);
            //System.out.println("pq2 : " + pq);
            
            int result = first + (second * 2); //섞은음식의 스코빌지수 계산
            pq.add(result); //결과값 넣어준다
            //System.out.println("pq3 : " + pq);
            answer++;
		}
		return answer;
	}

}
