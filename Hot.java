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
		
		//우선순위 정렬 (번호가 낮은 수가 위)선언
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//int배열에 들어가는 숫자 넣어주기
		for(int i = 0; i < scoville.length; i++) {
			pq.add(scoville[i]);
			System.out.println("pq : " + pq);
		}
		
		int answer = 0;
		//모든값이 K보다 작을때까지 반복
		while(pq.peek() < K) {
			if (pq.size() == 1) {
                return -1;
		}
			
			int first = pq.poll(); //가장 맵지 않은 음식(맨 앞 데이터)
			//System.out.println("minpq : " + pq);
            int second = pq.poll(); //두번째로 맵지 않은 음식(그 다음 데이터)
            //System.out.println("minpq2 : " + pq);
            //System.out.println("pq2 : " + pq);
            
            int result = first + (second * 2); //섞은음식의 스코빌 지수
            pq.add(result); //결과값 우선순위 큐에 삽입
            System.out.println("pq3 : " + pq);
            answer++;
		}
		return answer;
	}

}
